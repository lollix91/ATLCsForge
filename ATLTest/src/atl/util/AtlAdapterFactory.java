/**
 */
package atl.util;

import atl.*;

import ocl.VariableDeclaration;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see atl.AtlPackage
 * @generated
 */
public class AtlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AtlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtlSwitch<Adapter> modelSwitch =
		new AtlSwitch<Adapter>() {
			@Override
			public Adapter caseLocatedElement(LocatedElement object) {
				return createLocatedElementAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseModuleElement(ModuleElement object) {
				return createModuleElementAdapter();
			}
			@Override
			public Adapter caseHelper(Helper object) {
				return createHelperAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseMatchedRule(MatchedRule object) {
				return createMatchedRuleAdapter();
			}
			@Override
			public Adapter caseLazyMatchedRule(LazyMatchedRule object) {
				return createLazyMatchedRuleAdapter();
			}
			@Override
			public Adapter caseCalledRule(CalledRule object) {
				return createCalledRuleAdapter();
			}
			@Override
			public Adapter caseInPattern(InPattern object) {
				return createInPatternAdapter();
			}
			@Override
			public Adapter caseOutPattern(OutPattern object) {
				return createOutPatternAdapter();
			}
			@Override
			public Adapter caseDropPattern(DropPattern object) {
				return createDropPatternAdapter();
			}
			@Override
			public Adapter casePatternElement(PatternElement object) {
				return createPatternElementAdapter();
			}
			@Override
			public Adapter caseInPatternElement(InPatternElement object) {
				return createInPatternElementAdapter();
			}
			@Override
			public Adapter caseSimpleInPatternElement(SimpleInPatternElement object) {
				return createSimpleInPatternElementAdapter();
			}
			@Override
			public Adapter caseOutPatternElement(OutPatternElement object) {
				return createOutPatternElementAdapter();
			}
			@Override
			public Adapter caseSimpleOutPatternElement(SimpleOutPatternElement object) {
				return createSimpleOutPatternElementAdapter();
			}
			@Override
			public Adapter caseForEachOutPatternElement(ForEachOutPatternElement object) {
				return createForEachOutPatternElementAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseRuleVariableDeclaration(RuleVariableDeclaration object) {
				return createRuleVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseLibraryRef(LibraryRef object) {
				return createLibraryRefAdapter();
			}
			@Override
			public Adapter caseActionBlock(ActionBlock object) {
				return createActionBlockAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseExpressionStat(ExpressionStat object) {
				return createExpressionStatAdapter();
			}
			@Override
			public Adapter caseBindingStat(BindingStat object) {
				return createBindingStatAdapter();
			}
			@Override
			public Adapter caseIfStat(IfStat object) {
				return createIfStatAdapter();
			}
			@Override
			public Adapter caseForStat(ForStat object) {
				return createForStatAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link atl.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.ModuleElement <em>Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.ModuleElement
	 * @generated
	 */
	public Adapter createModuleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.Helper
	 * @generated
	 */
	public Adapter createHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.MatchedRule <em>Matched Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.MatchedRule
	 * @generated
	 */
	public Adapter createMatchedRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.LazyMatchedRule <em>Lazy Matched Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.LazyMatchedRule
	 * @generated
	 */
	public Adapter createLazyMatchedRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.CalledRule <em>Called Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.CalledRule
	 * @generated
	 */
	public Adapter createCalledRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.InPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.InPattern
	 * @generated
	 */
	public Adapter createInPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.OutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.OutPattern
	 * @generated
	 */
	public Adapter createOutPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.DropPattern <em>Drop Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.DropPattern
	 * @generated
	 */
	public Adapter createDropPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.PatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.PatternElement
	 * @generated
	 */
	public Adapter createPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.InPatternElement <em>In Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.InPatternElement
	 * @generated
	 */
	public Adapter createInPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.SimpleInPatternElement <em>Simple In Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.SimpleInPatternElement
	 * @generated
	 */
	public Adapter createSimpleInPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.OutPatternElement <em>Out Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.OutPatternElement
	 * @generated
	 */
	public Adapter createOutPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.SimpleOutPatternElement <em>Simple Out Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.SimpleOutPatternElement
	 * @generated
	 */
	public Adapter createSimpleOutPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.ForEachOutPatternElement <em>For Each Out Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.ForEachOutPatternElement
	 * @generated
	 */
	public Adapter createForEachOutPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.RuleVariableDeclaration <em>Rule Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.RuleVariableDeclaration
	 * @generated
	 */
	public Adapter createRuleVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.LibraryRef <em>Library Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.LibraryRef
	 * @generated
	 */
	public Adapter createLibraryRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.ActionBlock
	 * @generated
	 */
	public Adapter createActionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.ExpressionStat <em>Expression Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.ExpressionStat
	 * @generated
	 */
	public Adapter createExpressionStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.BindingStat <em>Binding Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.BindingStat
	 * @generated
	 */
	public Adapter createBindingStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.IfStat <em>If Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.IfStat
	 * @generated
	 */
	public Adapter createIfStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atl.ForStat <em>For Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atl.ForStat
	 * @generated
	 */
	public Adapter createForStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ocl.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ocl.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AtlAdapterFactory
