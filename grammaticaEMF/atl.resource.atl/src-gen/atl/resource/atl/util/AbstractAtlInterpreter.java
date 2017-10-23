/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractAtlInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<atl.resource.atl.IAtlInterpreterListener> listeners = new java.util.ArrayList<atl.resource.atl.IAtlInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof atl.Library) {
			result = interprete_atl_Library((atl.Library) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.Query) {
			result = interprete_atl_Query((atl.Query) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.Module) {
			result = interprete_atl_Module((atl.Module) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.Unit) {
			result = interprete_atl_Unit((atl.Unit) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.Helper) {
			result = interprete_atl_Helper((atl.Helper) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.LazyMatchedRule) {
			result = interprete_atl_LazyMatchedRule((atl.LazyMatchedRule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.MatchedRule) {
			result = interprete_atl_MatchedRule((atl.MatchedRule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.CalledRule) {
			result = interprete_atl_CalledRule((atl.CalledRule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.Rule) {
			result = interprete_atl_Rule((atl.Rule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.ModuleElement) {
			result = interprete_atl_ModuleElement((atl.ModuleElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.InPattern) {
			result = interprete_atl_InPattern((atl.InPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.OutPattern) {
			result = interprete_atl_OutPattern((atl.OutPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.DropPattern) {
			result = interprete_atl_DropPattern((atl.DropPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.SimpleInPatternElement) {
			result = interprete_atl_SimpleInPatternElement((atl.SimpleInPatternElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.InPatternElement) {
			result = interprete_atl_InPatternElement((atl.InPatternElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.SimpleOutPatternElement) {
			result = interprete_atl_SimpleOutPatternElement((atl.SimpleOutPatternElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.ForEachOutPatternElement) {
			result = interprete_atl_ForEachOutPatternElement((atl.ForEachOutPatternElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.OutPatternElement) {
			result = interprete_atl_OutPatternElement((atl.OutPatternElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.PatternElement) {
			result = interprete_atl_PatternElement((atl.PatternElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.Binding) {
			result = interprete_atl_Binding((atl.Binding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.RuleVariableDeclaration) {
			result = interprete_atl_RuleVariableDeclaration((atl.RuleVariableDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.LibraryRef) {
			result = interprete_atl_LibraryRef((atl.LibraryRef) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.ActionBlock) {
			result = interprete_atl_ActionBlock((atl.ActionBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.ExpressionStat) {
			result = interprete_atl_ExpressionStat((atl.ExpressionStat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.BindingStat) {
			result = interprete_atl_BindingStat((atl.BindingStat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.IfStat) {
			result = interprete_atl_IfStat((atl.IfStat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.ForStat) {
			result = interprete_atl_ForStat((atl.ForStat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.Statement) {
			result = interprete_atl_Statement((atl.Statement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.VariableExp) {
			result = interprete_ocl_VariableExp((ocl.VariableExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.SuperExp) {
			result = interprete_ocl_SuperExp((ocl.SuperExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.StringExp) {
			result = interprete_ocl_StringExp((ocl.StringExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.BooleanExp) {
			result = interprete_ocl_BooleanExp((ocl.BooleanExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.RealExp) {
			result = interprete_ocl_RealExp((ocl.RealExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.IntegerExp) {
			result = interprete_ocl_IntegerExp((ocl.IntegerExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.NumericExp) {
			result = interprete_ocl_NumericExp((ocl.NumericExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.PrimitiveExp) {
			result = interprete_ocl_PrimitiveExp((ocl.PrimitiveExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.BagExp) {
			result = interprete_ocl_BagExp((ocl.BagExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OrderedSetExp) {
			result = interprete_ocl_OrderedSetExp((ocl.OrderedSetExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.SequenceExp) {
			result = interprete_ocl_SequenceExp((ocl.SequenceExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.SetExp) {
			result = interprete_ocl_SetExp((ocl.SetExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.CollectionExp) {
			result = interprete_ocl_CollectionExp((ocl.CollectionExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.TupleExp) {
			result = interprete_ocl_TupleExp((ocl.TupleExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OclExpression) {
			result = interprete_ocl_OclExpression((ocl.OclExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.TuplePart) {
			result = interprete_ocl_TuplePart((ocl.TuplePart) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.MapExp) {
			result = interprete_ocl_MapExp((ocl.MapExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.MapElement) {
			result = interprete_ocl_MapElement((ocl.MapElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.EnumLiteralExp) {
			result = interprete_ocl_EnumLiteralExp((ocl.EnumLiteralExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OclUndefinedExp) {
			result = interprete_ocl_OclUndefinedExp((ocl.OclUndefinedExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.NavigationOrAttributeCallExp) {
			result = interprete_ocl_NavigationOrAttributeCallExp((ocl.NavigationOrAttributeCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OperatorCallExp) {
			result = interprete_ocl_OperatorCallExp((ocl.OperatorCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.CollectionOperationCallExp) {
			result = interprete_ocl_CollectionOperationCallExp((ocl.CollectionOperationCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OperationCallExp) {
			result = interprete_ocl_OperationCallExp((ocl.OperationCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.IterateExp) {
			result = interprete_ocl_IterateExp((ocl.IterateExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.IteratorExp) {
			result = interprete_ocl_IteratorExp((ocl.IteratorExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.LoopExp) {
			result = interprete_ocl_LoopExp((ocl.LoopExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.PropertyCallExp) {
			result = interprete_ocl_PropertyCallExp((ocl.PropertyCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.LetExp) {
			result = interprete_ocl_LetExp((ocl.LetExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.IfExp) {
			result = interprete_ocl_IfExp((ocl.IfExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.Iterator) {
			result = interprete_ocl_Iterator((ocl.Iterator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.Parameter) {
			result = interprete_ocl_Parameter((ocl.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.VariableDeclaration) {
			result = interprete_ocl_VariableDeclaration((ocl.VariableDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.CollectionType) {
			result = interprete_ocl_CollectionType((ocl.CollectionType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.StringType) {
			result = interprete_ocl_StringType((ocl.StringType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.BooleanType) {
			result = interprete_ocl_BooleanType((ocl.BooleanType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.IntegerType) {
			result = interprete_ocl_IntegerType((ocl.IntegerType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.RealType) {
			result = interprete_ocl_RealType((ocl.RealType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.NumericType) {
			result = interprete_ocl_NumericType((ocl.NumericType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.Primitive) {
			result = interprete_ocl_Primitive((ocl.Primitive) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.BagType) {
			result = interprete_ocl_BagType((ocl.BagType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OrderedSetType) {
			result = interprete_ocl_OrderedSetType((ocl.OrderedSetType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.SequenceType) {
			result = interprete_ocl_SequenceType((ocl.SequenceType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.SetType) {
			result = interprete_ocl_SetType((ocl.SetType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OclAnyType) {
			result = interprete_ocl_OclAnyType((ocl.OclAnyType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.TupleType) {
			result = interprete_ocl_TupleType((ocl.TupleType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.TupleTypeAttribute) {
			result = interprete_ocl_TupleTypeAttribute((ocl.TupleTypeAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OclModelElement) {
			result = interprete_ocl_OclModelElement((ocl.OclModelElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.MapType) {
			result = interprete_ocl_MapType((ocl.MapType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OclType) {
			result = interprete_ocl_OclType((ocl.OclType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OclFeatureDefinition) {
			result = interprete_ocl_OclFeatureDefinition((ocl.OclFeatureDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OclContextDefinition) {
			result = interprete_ocl_OclContextDefinition((ocl.OclContextDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.Attribute) {
			result = interprete_ocl_Attribute((ocl.Attribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.Operation) {
			result = interprete_ocl_Operation((ocl.Operation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OclFeature) {
			result = interprete_ocl_OclFeature((ocl.OclFeature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ocl.OclModel) {
			result = interprete_ocl_OclModel((ocl.OclModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof atl.LocatedElement) {
			result = interprete_atl_LocatedElement((atl.LocatedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_atl_LocatedElement(atl.LocatedElement locatedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_Unit(atl.Unit unit, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_Library(atl.Library library, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_Query(atl.Query query, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_Module(atl.Module module, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_ModuleElement(atl.ModuleElement moduleElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_Helper(atl.Helper helper, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_Rule(atl.Rule rule, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_MatchedRule(atl.MatchedRule matchedRule, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_LazyMatchedRule(atl.LazyMatchedRule lazyMatchedRule, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_CalledRule(atl.CalledRule calledRule, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_InPattern(atl.InPattern inPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_OutPattern(atl.OutPattern outPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_DropPattern(atl.DropPattern dropPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_PatternElement(atl.PatternElement patternElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_InPatternElement(atl.InPatternElement inPatternElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_SimpleInPatternElement(atl.SimpleInPatternElement simpleInPatternElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_OutPatternElement(atl.OutPatternElement outPatternElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_SimpleOutPatternElement(atl.SimpleOutPatternElement simpleOutPatternElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_ForEachOutPatternElement(atl.ForEachOutPatternElement forEachOutPatternElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_Binding(atl.Binding binding, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_RuleVariableDeclaration(atl.RuleVariableDeclaration ruleVariableDeclaration, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_LibraryRef(atl.LibraryRef libraryRef, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_ActionBlock(atl.ActionBlock actionBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_Statement(atl.Statement statement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_ExpressionStat(atl.ExpressionStat expressionStat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_BindingStat(atl.BindingStat bindingStat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_IfStat(atl.IfStat ifStat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_atl_ForStat(atl.ForStat forStat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OclExpression(ocl.OclExpression oclExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_VariableExp(ocl.VariableExp variableExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_SuperExp(ocl.SuperExp superExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_PrimitiveExp(ocl.PrimitiveExp primitiveExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_StringExp(ocl.StringExp stringExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_BooleanExp(ocl.BooleanExp booleanExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_NumericExp(ocl.NumericExp numericExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_RealExp(ocl.RealExp realExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_IntegerExp(ocl.IntegerExp integerExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_CollectionExp(ocl.CollectionExp collectionExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_BagExp(ocl.BagExp bagExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OrderedSetExp(ocl.OrderedSetExp orderedSetExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_SequenceExp(ocl.SequenceExp sequenceExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_SetExp(ocl.SetExp setExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_TupleExp(ocl.TupleExp tupleExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_TuplePart(ocl.TuplePart tuplePart, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_MapExp(ocl.MapExp mapExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_MapElement(ocl.MapElement mapElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_EnumLiteralExp(ocl.EnumLiteralExp enumLiteralExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OclUndefinedExp(ocl.OclUndefinedExp oclUndefinedExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_PropertyCallExp(ocl.PropertyCallExp propertyCallExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_NavigationOrAttributeCallExp(ocl.NavigationOrAttributeCallExp navigationOrAttributeCallExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OperationCallExp(ocl.OperationCallExp operationCallExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OperatorCallExp(ocl.OperatorCallExp operatorCallExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_CollectionOperationCallExp(ocl.CollectionOperationCallExp collectionOperationCallExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_LoopExp(ocl.LoopExp loopExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_IterateExp(ocl.IterateExp iterateExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_IteratorExp(ocl.IteratorExp iteratorExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_LetExp(ocl.LetExp letExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_IfExp(ocl.IfExp ifExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_VariableDeclaration(ocl.VariableDeclaration variableDeclaration, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_Iterator(ocl.Iterator iterator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_Parameter(ocl.Parameter parameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_CollectionType(ocl.CollectionType collectionType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OclType(ocl.OclType oclType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_Primitive(ocl.Primitive primitive, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_StringType(ocl.StringType stringType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_BooleanType(ocl.BooleanType booleanType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_NumericType(ocl.NumericType numericType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_IntegerType(ocl.IntegerType integerType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_RealType(ocl.RealType realType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_BagType(ocl.BagType bagType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OrderedSetType(ocl.OrderedSetType orderedSetType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_SequenceType(ocl.SequenceType sequenceType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_SetType(ocl.SetType setType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OclAnyType(ocl.OclAnyType oclAnyType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_TupleType(ocl.TupleType tupleType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_TupleTypeAttribute(ocl.TupleTypeAttribute tupleTypeAttribute, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OclModelElement(ocl.OclModelElement oclModelElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_MapType(ocl.MapType mapType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OclFeatureDefinition(ocl.OclFeatureDefinition oclFeatureDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OclContextDefinition(ocl.OclContextDefinition oclContextDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OclFeature(ocl.OclFeature oclFeature, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_Attribute(ocl.Attribute attribute, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_Operation(ocl.Operation operation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ocl_OclModel(ocl.OclModel oclModel, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (atl.resource.atl.IAtlInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(atl.resource.atl.IAtlInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(atl.resource.atl.IAtlInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
