/**
 */
package ocl.impl;

import ocl.*;

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
public class OclFactoryImpl extends EFactoryImpl implements OclFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OclFactory init() {
		try {
			OclFactory theOclFactory = (OclFactory)EPackage.Registry.INSTANCE.getEFactory(OclPackage.eNS_URI);
			if (theOclFactory != null) {
				return theOclFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OclFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclFactoryImpl() {
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
			case OclPackage.VARIABLE_EXP: return createVariableExp();
			case OclPackage.SUPER_EXP: return createSuperExp();
			case OclPackage.STRING_EXP: return createStringExp();
			case OclPackage.BOOLEAN_EXP: return createBooleanExp();
			case OclPackage.REAL_EXP: return createRealExp();
			case OclPackage.INTEGER_EXP: return createIntegerExp();
			case OclPackage.BAG_EXP: return createBagExp();
			case OclPackage.ORDERED_SET_EXP: return createOrderedSetExp();
			case OclPackage.SEQUENCE_EXP: return createSequenceExp();
			case OclPackage.SET_EXP: return createSetExp();
			case OclPackage.TUPLE_EXP: return createTupleExp();
			case OclPackage.TUPLE_PART: return createTuplePart();
			case OclPackage.MAP_EXP: return createMapExp();
			case OclPackage.MAP_ELEMENT: return createMapElement();
			case OclPackage.ENUM_LITERAL_EXP: return createEnumLiteralExp();
			case OclPackage.OCL_UNDEFINED_EXP: return createOclUndefinedExp();
			case OclPackage.NAVIGATION_OR_ATTRIBUTE_CALL_EXP: return createNavigationOrAttributeCallExp();
			case OclPackage.OPERATION_CALL_EXP: return createOperationCallExp();
			case OclPackage.OPERATOR_CALL_EXP: return createOperatorCallExp();
			case OclPackage.COLLECTION_OPERATION_CALL_EXP: return createCollectionOperationCallExp();
			case OclPackage.ITERATE_EXP: return createIterateExp();
			case OclPackage.ITERATOR_EXP: return createIteratorExp();
			case OclPackage.LET_EXP: return createLetExp();
			case OclPackage.IF_EXP: return createIfExp();
			case OclPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case OclPackage.ITERATOR: return createIterator();
			case OclPackage.PARAMETER: return createParameter();
			case OclPackage.COLLECTION_TYPE: return createCollectionType();
			case OclPackage.OCL_TYPE: return createOclType();
			case OclPackage.STRING_TYPE: return createStringType();
			case OclPackage.BOOLEAN_TYPE: return createBooleanType();
			case OclPackage.INTEGER_TYPE: return createIntegerType();
			case OclPackage.REAL_TYPE: return createRealType();
			case OclPackage.BAG_TYPE: return createBagType();
			case OclPackage.ORDERED_SET_TYPE: return createOrderedSetType();
			case OclPackage.SEQUENCE_TYPE: return createSequenceType();
			case OclPackage.SET_TYPE: return createSetType();
			case OclPackage.OCL_ANY_TYPE: return createOclAnyType();
			case OclPackage.TUPLE_TYPE: return createTupleType();
			case OclPackage.TUPLE_TYPE_ATTRIBUTE: return createTupleTypeAttribute();
			case OclPackage.OCL_MODEL_ELEMENT: return createOclModelElement();
			case OclPackage.MAP_TYPE: return createMapType();
			case OclPackage.OCL_FEATURE_DEFINITION: return createOclFeatureDefinition();
			case OclPackage.OCL_CONTEXT_DEFINITION: return createOclContextDefinition();
			case OclPackage.ATTRIBUTE: return createAttribute();
			case OclPackage.OPERATION: return createOperation();
			case OclPackage.OCL_MODEL: return createOclModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExp createVariableExp() {
		VariableExpImpl variableExp = new VariableExpImpl();
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperExp createSuperExp() {
		SuperExpImpl superExp = new SuperExpImpl();
		return superExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExp createStringExp() {
		StringExpImpl stringExp = new StringExpImpl();
		return stringExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExp createBooleanExp() {
		BooleanExpImpl booleanExp = new BooleanExpImpl();
		return booleanExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealExp createRealExp() {
		RealExpImpl realExp = new RealExpImpl();
		return realExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExp createIntegerExp() {
		IntegerExpImpl integerExp = new IntegerExpImpl();
		return integerExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagExp createBagExp() {
		BagExpImpl bagExp = new BagExpImpl();
		return bagExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSetExp createOrderedSetExp() {
		OrderedSetExpImpl orderedSetExp = new OrderedSetExpImpl();
		return orderedSetExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceExp createSequenceExp() {
		SequenceExpImpl sequenceExp = new SequenceExpImpl();
		return sequenceExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExp createSetExp() {
		SetExpImpl setExp = new SetExpImpl();
		return setExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleExp createTupleExp() {
		TupleExpImpl tupleExp = new TupleExpImpl();
		return tupleExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuplePart createTuplePart() {
		TuplePartImpl tuplePart = new TuplePartImpl();
		return tuplePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapExp createMapExp() {
		MapExpImpl mapExp = new MapExpImpl();
		return mapExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapElement createMapElement() {
		MapElementImpl mapElement = new MapElementImpl();
		return mapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralExp createEnumLiteralExp() {
		EnumLiteralExpImpl enumLiteralExp = new EnumLiteralExpImpl();
		return enumLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclUndefinedExp createOclUndefinedExp() {
		OclUndefinedExpImpl oclUndefinedExp = new OclUndefinedExpImpl();
		return oclUndefinedExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationOrAttributeCallExp createNavigationOrAttributeCallExp() {
		NavigationOrAttributeCallExpImpl navigationOrAttributeCallExp = new NavigationOrAttributeCallExpImpl();
		return navigationOrAttributeCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallExp createOperationCallExp() {
		OperationCallExpImpl operationCallExp = new OperationCallExpImpl();
		return operationCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorCallExp createOperatorCallExp() {
		OperatorCallExpImpl operatorCallExp = new OperatorCallExpImpl();
		return operatorCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionOperationCallExp createCollectionOperationCallExp() {
		CollectionOperationCallExpImpl collectionOperationCallExp = new CollectionOperationCallExpImpl();
		return collectionOperationCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateExp createIterateExp() {
		IterateExpImpl iterateExp = new IterateExpImpl();
		return iterateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorExp createIteratorExp() {
		IteratorExpImpl iteratorExp = new IteratorExpImpl();
		return iteratorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExp createLetExp() {
		LetExpImpl letExp = new LetExpImpl();
		return letExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp createIfExp() {
		IfExpImpl ifExp = new IfExpImpl();
		return ifExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator createIterator() {
		IteratorImpl iterator = new IteratorImpl();
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclType createOclType() {
		OclTypeImpl oclType = new OclTypeImpl();
		return oclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagType createBagType() {
		BagTypeImpl bagType = new BagTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSetType createOrderedSetType() {
		OrderedSetTypeImpl orderedSetType = new OrderedSetTypeImpl();
		return orderedSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclAnyType createOclAnyType() {
		OclAnyTypeImpl oclAnyType = new OclAnyTypeImpl();
		return oclAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleTypeAttribute createTupleTypeAttribute() {
		TupleTypeAttributeImpl tupleTypeAttribute = new TupleTypeAttributeImpl();
		return tupleTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclModelElement createOclModelElement() {
		OclModelElementImpl oclModelElement = new OclModelElementImpl();
		return oclModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclFeatureDefinition createOclFeatureDefinition() {
		OclFeatureDefinitionImpl oclFeatureDefinition = new OclFeatureDefinitionImpl();
		return oclFeatureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclContextDefinition createOclContextDefinition() {
		OclContextDefinitionImpl oclContextDefinition = new OclContextDefinitionImpl();
		return oclContextDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclModel createOclModel() {
		OclModelImpl oclModel = new OclModelImpl();
		return oclModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclPackage getOclPackage() {
		return (OclPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OclPackage getPackage() {
		return OclPackage.eINSTANCE;
	}

} //OclFactoryImpl
