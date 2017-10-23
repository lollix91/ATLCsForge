/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

public class AtlTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public atl.resource.atl.IAtlTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("Unit".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("location".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("commentsBefore".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("commentsAfter".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("libraries".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("name".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Library".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("helpers".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Query".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("body".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Module".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("inModels".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("outModels".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("elements".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Helper".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("module".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("query".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("library".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("definition".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MatchedRule".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("outPattern".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("actionBlock".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("variables".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("inPattern".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("children".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("superRule".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LazyMatchedRule".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CalledRule".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("parameters".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("InPattern".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("rule".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("filter".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OutPattern".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("dropPattern".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DropPattern".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SimpleInPatternElement".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("id".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("varName".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("type".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("initExpression".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("letExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("baseExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("variableExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("mapsTo".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("models".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SimpleOutPatternElement".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("sourceElement".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("bindings".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("model".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("reverseBindings".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ForEachOutPatternElement".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("collection".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("iterator".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Binding".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("value".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("outPatternElement".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("propertyName".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RuleVariableDeclaration".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LibraryRef".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("unit".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ActionBlock".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("statements".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ExpressionStat".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("expression".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BindingStat".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("source".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IfStat".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("condition".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("thenStatements".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("elseStatements".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ForStat".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("VariableExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ifExp3".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("appliedProperty".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("loopExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("parentOperation".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("initializedVariable".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ifExp2".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("owningOperation".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ifExp1".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("owningAttribute".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("referredVariable".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SuperExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("StringExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("stringSymbol".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BooleanExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RealExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("realSymbol".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IntegerExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("integerSymbol".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BagExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OrderedSetExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SequenceExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SetExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TupleExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("tuplePart".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TuplePart".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("tuple".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MapExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MapElement".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("map".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("key".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EnumLiteralExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OclUndefinedExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NavigationOrAttributeCallExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OperationCallExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("arguments".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("operationName".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OperatorCallExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CollectionOperationCallExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IterateExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("iterators".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("result".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IteratorExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LetExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("variable".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("in_".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IfExp".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("thenExpression".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("elseExpression".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("VariableDeclaration".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Iterator".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("loopExpr".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Parameter".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("operation".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CollectionType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("definitions".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("oclExpression".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("mapType2".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("attribute".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("mapType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("collectionTypes".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("tupleTypeAttribute".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("variableDeclaration".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("elementType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OclType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("StringType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BooleanType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IntegerType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RealType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BagType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OrderedSetType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SequenceType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SetType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OclAnyType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TupleType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("attributes".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TupleTypeAttribute".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("tupleType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OclModelElement".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("MapType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("valueType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("keyType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OclFeatureDefinition".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("feature".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("context_".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OclContextDefinition".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Attribute".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Operation".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("returnType".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OclModel".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metamodel".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isRefining".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isAbstract".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isNoDefault".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isUnique".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isEntrypoint".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isEndpoint".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isAssignment".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("booleanSymbol".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new atl.resource.atl.mopp.AtlTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
