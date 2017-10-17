/**
 */
package atl.impl;

import atl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtlFactoryImpl extends EFactoryImpl implements AtlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtlFactory init() {
		try {
			AtlFactory theAtlFactory = (AtlFactory)EPackage.Registry.INSTANCE.getEFactory(AtlPackage.eNS_URI);
			if (theAtlFactory != null) {
				return theAtlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AtlPackage.UNIT: return createUnit();
			case AtlPackage.LIBRARY: return createLibrary();
			case AtlPackage.QUERY: return createQuery();
			case AtlPackage.MODULE: return createModule();
			case AtlPackage.HELPER: return createHelper();
			case AtlPackage.MATCHED_RULE: return createMatchedRule();
			case AtlPackage.LAZY_MATCHED_RULE: return createLazyMatchedRule();
			case AtlPackage.CALLED_RULE: return createCalledRule();
			case AtlPackage.IN_PATTERN: return createInPattern();
			case AtlPackage.OUT_PATTERN: return createOutPattern();
			case AtlPackage.DROP_PATTERN: return createDropPattern();
			case AtlPackage.SIMPLE_IN_PATTERN_ELEMENT: return createSimpleInPatternElement();
			case AtlPackage.SIMPLE_OUT_PATTERN_ELEMENT: return createSimpleOutPatternElement();
			case AtlPackage.FOR_EACH_OUT_PATTERN_ELEMENT: return createForEachOutPatternElement();
			case AtlPackage.BINDING: return createBinding();
			case AtlPackage.RULE_VARIABLE_DECLARATION: return createRuleVariableDeclaration();
			case AtlPackage.LIBRARY_REF: return createLibraryRef();
			case AtlPackage.ACTION_BLOCK: return createActionBlock();
			case AtlPackage.EXPRESSION_STAT: return createExpressionStat();
			case AtlPackage.BINDING_STAT: return createBindingStat();
			case AtlPackage.IF_STAT: return createIfStat();
			case AtlPackage.FOR_STAT: return createForStat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Helper createHelper() {
		HelperImpl helper = new HelperImpl();
		return helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedRule createMatchedRule() {
		MatchedRuleImpl matchedRule = new MatchedRuleImpl();
		return matchedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyMatchedRule createLazyMatchedRule() {
		LazyMatchedRuleImpl lazyMatchedRule = new LazyMatchedRuleImpl();
		return lazyMatchedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledRule createCalledRule() {
		CalledRuleImpl calledRule = new CalledRuleImpl();
		return calledRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPattern createInPattern() {
		InPatternImpl inPattern = new InPatternImpl();
		return inPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPattern createOutPattern() {
		OutPatternImpl outPattern = new OutPatternImpl();
		return outPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropPattern createDropPattern() {
		DropPatternImpl dropPattern = new DropPatternImpl();
		return dropPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleInPatternElement createSimpleInPatternElement() {
		SimpleInPatternElementImpl simpleInPatternElement = new SimpleInPatternElementImpl();
		return simpleInPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOutPatternElement createSimpleOutPatternElement() {
		SimpleOutPatternElementImpl simpleOutPatternElement = new SimpleOutPatternElementImpl();
		return simpleOutPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEachOutPatternElement createForEachOutPatternElement() {
		ForEachOutPatternElementImpl forEachOutPatternElement = new ForEachOutPatternElementImpl();
		return forEachOutPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleVariableDeclaration createRuleVariableDeclaration() {
		RuleVariableDeclarationImpl ruleVariableDeclaration = new RuleVariableDeclarationImpl();
		return ruleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRef createLibraryRef() {
		LibraryRefImpl libraryRef = new LibraryRefImpl();
		return libraryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBlock createActionBlock() {
		ActionBlockImpl actionBlock = new ActionBlockImpl();
		return actionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStat createExpressionStat() {
		ExpressionStatImpl expressionStat = new ExpressionStatImpl();
		return expressionStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStat createBindingStat() {
		BindingStatImpl bindingStat = new BindingStatImpl();
		return bindingStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStat createIfStat() {
		IfStatImpl ifStat = new IfStatImpl();
		return ifStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStat createForStat() {
		ForStatImpl forStat = new ForStatImpl();
		return forStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlPackage getAtlPackage() {
		return (AtlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtlPackage getPackage() {
		return AtlPackage.eINSTANCE;
	}

} //AtlFactoryImpl
