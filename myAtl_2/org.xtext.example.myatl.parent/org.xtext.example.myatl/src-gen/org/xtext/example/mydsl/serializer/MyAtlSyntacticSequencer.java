/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyAtlGrammarAccess;

@SuppressWarnings("all")
public class MyAtlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyAtlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ATLDefCS___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_CalledRule_CommaKeyword_11_q;
	protected AbstractElementAlias match_CalledRule_CommaKeyword_9_q;
	protected AbstractElementAlias match_CalledRule_FullStopFullStopFullStopKeyword_8_q;
	protected AbstractElementAlias match_CalledRule___EndpointKeyword_0_1_or_EntrypointKeyword_0_0__q;
	protected AbstractElementAlias match_CalledRule___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_1__q;
	protected AbstractElementAlias match_CalledRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_CollectionTypeCS_LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0;
	protected AbstractElementAlias match_CollectionTypeCS_RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0;
	protected AbstractElementAlias match_CollectionTypeCS_____LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0_____RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0____q;
	protected AbstractElementAlias match_Helper_ContextKeyword_1_q;
	protected AbstractElementAlias match_InPattern___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	protected AbstractElementAlias match_MatchedRule_CommaKeyword_11_q;
	protected AbstractElementAlias match_MatchedRule_CommaKeyword_9_q;
	protected AbstractElementAlias match_MatchedRule_FullStopFullStopFullStopKeyword_8_q;
	protected AbstractElementAlias match_MatchedRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_Module_ColonKeyword_9_1_1_or_CommaKeyword_9_1_0;
	protected AbstractElementAlias match_Module___INKeyword_10_1_or_InKeyword_10_0__q;
	protected AbstractElementAlias match_QueryRule___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_SimpleOutPatternElement___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyAtlGrammarAccess) access;
		match_ATLDefCS___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getATLDefCSAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getATLDefCSAccess().getRightParenthesisKeyword_3_2()));
		match_CalledRule_CommaKeyword_11_q = new TokenAlias(false, true, grammarAccess.getCalledRuleAccess().getCommaKeyword_11());
		match_CalledRule_CommaKeyword_9_q = new TokenAlias(false, true, grammarAccess.getCalledRuleAccess().getCommaKeyword_9());
		match_CalledRule_FullStopFullStopFullStopKeyword_8_q = new TokenAlias(false, true, grammarAccess.getCalledRuleAccess().getFullStopFullStopFullStopKeyword_8());
		match_CalledRule___EndpointKeyword_0_1_or_EntrypointKeyword_0_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getCalledRuleAccess().getEndpointKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getCalledRuleAccess().getEntrypointKeyword_0_0()));
		match_CalledRule___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCalledRuleAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getCalledRuleAccess().getRightParenthesisKeyword_3_1()));
		match_CalledRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCalledRuleAccess().getUsingKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getCalledRuleAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getCalledRuleAccess().getRightCurlyBracketKeyword_5_3()));
		match_CollectionTypeCS_LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCollectionTypeCSAccess().getLeftCurlyBracketKeyword_1_0_0_1()), new TokenAlias(false, false, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0_0()));
		match_CollectionTypeCS_RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCollectionTypeCSAccess().getRightCurlyBracketKeyword_1_0_2_1()), new TokenAlias(false, false, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2_0()));
		match_CollectionTypeCS_____LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0_____RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0____q = new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCollectionTypeCSAccess().getLeftCurlyBracketKeyword_1_0_0_1()), new TokenAlias(false, false, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0_0_0())), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCollectionTypeCSAccess().getRightCurlyBracketKeyword_1_0_2_1()), new TokenAlias(false, false, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_0_2_0())));
		match_Helper_ContextKeyword_1_q = new TokenAlias(false, true, grammarAccess.getHelperAccess().getContextKeyword_1());
		match_InPattern___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInPatternAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getInPatternAccess().getRightParenthesisKeyword_1_2()));
		match_MatchedRule_CommaKeyword_11_q = new TokenAlias(false, true, grammarAccess.getMatchedRuleAccess().getCommaKeyword_11());
		match_MatchedRule_CommaKeyword_9_q = new TokenAlias(false, true, grammarAccess.getMatchedRuleAccess().getCommaKeyword_9());
		match_MatchedRule_FullStopFullStopFullStopKeyword_8_q = new TokenAlias(false, true, grammarAccess.getMatchedRuleAccess().getFullStopFullStopFullStopKeyword_8());
		match_MatchedRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMatchedRuleAccess().getUsingKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getMatchedRuleAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getMatchedRuleAccess().getRightCurlyBracketKeyword_5_3()));
		match_Module_ColonKeyword_9_1_1_or_CommaKeyword_9_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getModuleAccess().getColonKeyword_9_1_1()), new TokenAlias(false, false, grammarAccess.getModuleAccess().getCommaKeyword_9_1_0()));
		match_Module___INKeyword_10_1_or_InKeyword_10_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getModuleAccess().getINKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getModuleAccess().getInKeyword_10_0()));
		match_QueryRule___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getQueryRuleAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getQueryRuleAccess().getRightParenthesisKeyword_2_2()));
		match_SimpleOutPatternElement___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSimpleOutPatternElementAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSimpleOutPatternElementAccess().getRightParenthesisKeyword_3_2()));
		match_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q = new AlternativeAlias(false, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLessThanSignKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getGreaterThanSignKeyword_1_1_2())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ATLDefCS___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_ATLDefCS___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CalledRule_CommaKeyword_11_q.equals(syntax))
				emit_CalledRule_CommaKeyword_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CalledRule_CommaKeyword_9_q.equals(syntax))
				emit_CalledRule_CommaKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CalledRule_FullStopFullStopFullStopKeyword_8_q.equals(syntax))
				emit_CalledRule_FullStopFullStopFullStopKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CalledRule___EndpointKeyword_0_1_or_EntrypointKeyword_0_0__q.equals(syntax))
				emit_CalledRule___EndpointKeyword_0_1_or_EntrypointKeyword_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CalledRule___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_1__q.equals(syntax))
				emit_CalledRule___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CalledRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_CalledRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CollectionTypeCS_LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0.equals(syntax))
				emit_CollectionTypeCS_LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CollectionTypeCS_RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0.equals(syntax))
				emit_CollectionTypeCS_RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CollectionTypeCS_____LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0_____RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0____q.equals(syntax))
				emit_CollectionTypeCS_____LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0_____RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Helper_ContextKeyword_1_q.equals(syntax))
				emit_Helper_ContextKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InPattern___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_InPattern___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MatchedRule_CommaKeyword_11_q.equals(syntax))
				emit_MatchedRule_CommaKeyword_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MatchedRule_CommaKeyword_9_q.equals(syntax))
				emit_MatchedRule_CommaKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MatchedRule_FullStopFullStopFullStopKeyword_8_q.equals(syntax))
				emit_MatchedRule_FullStopFullStopFullStopKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MatchedRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_MatchedRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Module_ColonKeyword_9_1_1_or_CommaKeyword_9_1_0.equals(syntax))
				emit_Module_ColonKeyword_9_1_1_or_CommaKeyword_9_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Module___INKeyword_10_1_or_InKeyword_10_0__q.equals(syntax))
				emit_Module___INKeyword_10_1_or_InKeyword_10_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_QueryRule___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_QueryRule___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimpleOutPatternElement___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_SimpleOutPatternElement___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q.equals(syntax))
				emit_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     varName=UnrestrictedName (ambiguity) ':' type=ATLType
	 */
	protected void emit_ATLDefCS___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     actionBlock=ActionBlock '}' (ambiguity) '}' (rule end)
	 *     outPattern=OutPattern '...'? ','? (ambiguity) '}' (rule end)
	 */
	protected void emit_CalledRule_CommaKeyword_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     outPattern=OutPattern '...'? (ambiguity) ','? '}' (rule end)
	 *     outPattern=OutPattern '...'? (ambiguity) 'do' '{' actionBlock=ActionBlock
	 */
	protected void emit_CalledRule_CommaKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '...'?
	 *
	 * This ambiguous syntax occurs at:
	 *     outPattern=OutPattern (ambiguity) ','? ','? '}' (rule end)
	 *     outPattern=OutPattern (ambiguity) ','? 'do' '{' actionBlock=ActionBlock
	 */
	protected void emit_CalledRule_FullStopFullStopFullStopKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('endpoint' | 'entrypoint')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'rule' name=UnrestrictedName
	 */
	protected void emit_CalledRule___EndpointKeyword_0_1_or_EntrypointKeyword_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=UnrestrictedName (ambiguity) '{' 'using' '{' variables+=RuleVariableDeclaration
	 *     name=UnrestrictedName (ambiguity) '{' ('using' '{' '}')? 'to' outPattern=OutPattern
	 */
	protected void emit_CalledRule___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('using' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=UnrestrictedName ('(' ')')? '{' (ambiguity) 'to' outPattern=OutPattern
	 */
	protected void emit_CalledRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '(' | '{'
	 *
	 * This ambiguous syntax occurs at:
	 *     name=CollectionTypeIdentifier (ambiguity) ownedType=TypeExpCS
	 */
	protected void emit_CollectionTypeCS_LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ')' | '}'
	 *
	 * This ambiguous syntax occurs at:
	 *     ownedType=TypeExpCS (ambiguity) (rule end)
	 */
	protected void emit_CollectionTypeCS_RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (('(' | '{') (')' | '}'))?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=CollectionTypeIdentifier (ambiguity) (rule end)
	 */
	protected void emit_CollectionTypeCS_____LeftCurlyBracketKeyword_1_0_0_1_or_LeftParenthesisKeyword_1_0_0_0_____RightCurlyBracketKeyword_1_0_2_1_or_RightParenthesisKeyword_1_0_2_0____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'context'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'helper' (ambiguity) definition=ATLDefCS
	 *     (rule start) 'helper' (ambiguity) name=UnrestrictedName
	 */
	protected void emit_Helper_ContextKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=InPatternElement (ambiguity) (rule end)
	 */
	protected void emit_InPattern___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     actionBlock=ActionBlock '}' (ambiguity) '}' (rule end)
	 *     outPattern=OutPattern '...'? ','? (ambiguity) '}' (rule end)
	 */
	protected void emit_MatchedRule_CommaKeyword_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     outPattern=OutPattern '...'? (ambiguity) ','? '}' (rule end)
	 *     outPattern=OutPattern '...'? (ambiguity) 'do' '{' actionBlock=ActionBlock
	 */
	protected void emit_MatchedRule_CommaKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '...'?
	 *
	 * This ambiguous syntax occurs at:
	 *     outPattern=OutPattern (ambiguity) ','? ','? '}' (rule end)
	 *     outPattern=OutPattern (ambiguity) ','? 'do' '{' actionBlock=ActionBlock
	 */
	protected void emit_MatchedRule_FullStopFullStopFullStopKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('using' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     inPattern=InPattern (ambiguity) 'to' outPattern=OutPattern
	 */
	protected void emit_MatchedRule___UsingKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ',' | ':'
	 *
	 * This ambiguous syntax occurs at:
	 *     inModels+=NameExpCS (ambiguity) ',' inModels+=NameExpCS
	 *     inModels+=NameExpCS (ambiguity) ('in' | 'IN')? ':' inModels+=NameExpCS
	 *     inModels+=NameExpCS (ambiguity) inModels+=NameExpCS
	 */
	protected void emit_Module_ColonKeyword_9_1_1_or_CommaKeyword_9_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('in' | 'IN')?
	 *
	 * This ambiguous syntax occurs at:
	 *     inModels+=NameExpCS (',' | ':') (ambiguity) ':' inModels+=NameExpCS
	 *     inModels+=NameExpCS (ambiguity) ':' inModels+=NameExpCS
	 *     outModels+=NameExpCS 'from' (ambiguity) ':' inModels+=NameExpCS
	 */
	protected void emit_Module___INKeyword_10_1_or_InKeyword_10_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=UnrestrictedName (ambiguity) '=' initExpression=ExpCS
	 */
	protected void emit_QueryRule___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=ATLType (ambiguity) (rule end)
	 */
	protected void emit_SimpleOutPatternElement___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (('(' ')') | ('<' '>'))?
	 *
	 * This ambiguous syntax occurs at:
	 *     name='Tuple' (ambiguity) backtrack='true'
	 */
	protected void emit_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
