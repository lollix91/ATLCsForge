/**
 */
package atl;

import ocl.OclPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see atl.AtlFactory
 * @model kind="package"
 * @generated
 */
public interface AtlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmt/2005/ATL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlPackage eINSTANCE = atl.impl.AtlPackageImpl.init();

	/**
	 * The meta object id for the '{@link atl.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.LocatedElementImpl
	 * @see atl.impl.AtlPackageImpl#getLocatedElement()
	 * @generated
	 */
	int LOCATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COMMENTS_BEFORE = 1;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COMMENTS_AFTER = 2;

	/**
	 * The number of structural features of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link atl.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.UnitImpl
	 * @see atl.impl.AtlPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__LIBRARIES = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link atl.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.LibraryImpl
	 * @see atl.impl.AtlPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LOCATION = UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__COMMENTS_BEFORE = UNIT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__COMMENTS_AFTER = UNIT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LIBRARIES = UNIT__LIBRARIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Helpers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__HELPERS = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atl.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.QueryImpl
	 * @see atl.impl.AtlPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__LOCATION = UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__COMMENTS_BEFORE = UNIT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__COMMENTS_AFTER = UNIT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__LIBRARIES = UNIT__LIBRARIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__BODY = UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Helpers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__HELPERS = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link atl.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.ModuleImpl
	 * @see atl.impl.AtlPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LOCATION = UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COMMENTS_BEFORE = UNIT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COMMENTS_AFTER = UNIT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LIBRARIES = UNIT__LIBRARIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Is Refining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_REFINING = UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IN_MODELS = UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OUT_MODELS = UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ELEMENTS = UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = UNIT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link atl.impl.ModuleElementImpl <em>Module Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.ModuleElementImpl
	 * @see atl.impl.AtlPackageImpl#getModuleElement()
	 * @generated
	 */
	int MODULE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__MODULE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atl.impl.HelperImpl <em>Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.HelperImpl
	 * @see atl.impl.AtlPackageImpl#getHelper()
	 * @generated
	 */
	int HELPER = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__LOCATION = MODULE_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__COMMENTS_BEFORE = MODULE_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__COMMENTS_AFTER = MODULE_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__MODULE = MODULE_ELEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Query</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__QUERY = MODULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__LIBRARY = MODULE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__DEFINITION = MODULE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FEATURE_COUNT = MODULE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link atl.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.RuleImpl
	 * @see atl.impl.AtlPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LOCATION = MODULE_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COMMENTS_BEFORE = MODULE_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COMMENTS_AFTER = MODULE_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MODULE = MODULE_ELEMENT__MODULE;

	/**
	 * The feature id for the '<em><b>Out Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OUT_PATTERN = MODULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTION_BLOCK = MODULE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__VARIABLES = MODULE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = MODULE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = MODULE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link atl.impl.MatchedRuleImpl <em>Matched Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.MatchedRuleImpl
	 * @see atl.impl.AtlPackageImpl#getMatchedRule()
	 * @generated
	 */
	int MATCHED_RULE = 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__LOCATION = RULE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__COMMENTS_BEFORE = RULE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__COMMENTS_AFTER = RULE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__MODULE = RULE__MODULE;

	/**
	 * The feature id for the '<em><b>Out Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__OUT_PATTERN = RULE__OUT_PATTERN;

	/**
	 * The feature id for the '<em><b>Action Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__ACTION_BLOCK = RULE__ACTION_BLOCK;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__VARIABLES = RULE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>In Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__IN_PATTERN = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__CHILDREN = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__SUPER_RULE = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__IS_ABSTRACT = RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Refining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__IS_REFINING = RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE__IS_NO_DEFAULT = RULE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Matched Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link atl.impl.LazyMatchedRuleImpl <em>Lazy Matched Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.LazyMatchedRuleImpl
	 * @see atl.impl.AtlPackageImpl#getLazyMatchedRule()
	 * @generated
	 */
	int LAZY_MATCHED_RULE = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__LOCATION = MATCHED_RULE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__COMMENTS_BEFORE = MATCHED_RULE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__COMMENTS_AFTER = MATCHED_RULE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__MODULE = MATCHED_RULE__MODULE;

	/**
	 * The feature id for the '<em><b>Out Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__OUT_PATTERN = MATCHED_RULE__OUT_PATTERN;

	/**
	 * The feature id for the '<em><b>Action Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__ACTION_BLOCK = MATCHED_RULE__ACTION_BLOCK;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__VARIABLES = MATCHED_RULE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__NAME = MATCHED_RULE__NAME;

	/**
	 * The feature id for the '<em><b>In Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__IN_PATTERN = MATCHED_RULE__IN_PATTERN;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__CHILDREN = MATCHED_RULE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Super Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__SUPER_RULE = MATCHED_RULE__SUPER_RULE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__IS_ABSTRACT = MATCHED_RULE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Refining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__IS_REFINING = MATCHED_RULE__IS_REFINING;

	/**
	 * The feature id for the '<em><b>Is No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__IS_NO_DEFAULT = MATCHED_RULE__IS_NO_DEFAULT;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE__IS_UNIQUE = MATCHED_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lazy Matched Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_MATCHED_RULE_FEATURE_COUNT = MATCHED_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atl.impl.CalledRuleImpl <em>Called Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.CalledRuleImpl
	 * @see atl.impl.AtlPackageImpl#getCalledRule()
	 * @generated
	 */
	int CALLED_RULE = 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__LOCATION = RULE__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__COMMENTS_BEFORE = RULE__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__COMMENTS_AFTER = RULE__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__MODULE = RULE__MODULE;

	/**
	 * The feature id for the '<em><b>Out Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__OUT_PATTERN = RULE__OUT_PATTERN;

	/**
	 * The feature id for the '<em><b>Action Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__ACTION_BLOCK = RULE__ACTION_BLOCK;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__VARIABLES = RULE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__PARAMETERS = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__IS_ENTRYPOINT = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE__IS_ENDPOINT = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Called Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link atl.impl.InPatternImpl <em>In Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.InPatternImpl
	 * @see atl.impl.AtlPackageImpl#getInPattern()
	 * @generated
	 */
	int IN_PATTERN = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__ELEMENTS = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__RULE = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN__FILTER = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>In Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link atl.impl.OutPatternImpl <em>Out Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.OutPatternImpl
	 * @see atl.impl.AtlPackageImpl#getOutPattern()
	 * @generated
	 */
	int OUT_PATTERN = 12;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__RULE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drop Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__DROP_PATTERN = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN__ELEMENTS = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Out Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link atl.impl.DropPatternImpl <em>Drop Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.DropPatternImpl
	 * @see atl.impl.AtlPackageImpl#getDropPattern()
	 * @generated
	 */
	int DROP_PATTERN = 13;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PATTERN__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PATTERN__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PATTERN__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Out Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PATTERN__OUT_PATTERN = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_PATTERN_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atl.impl.PatternElementImpl <em>Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.PatternElementImpl
	 * @see atl.impl.AtlPackageImpl#getPatternElement()
	 * @generated
	 */
	int PATTERN_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__LOCATION = OclPackage.VARIABLE_DECLARATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__COMMENTS_BEFORE = OclPackage.VARIABLE_DECLARATION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__COMMENTS_AFTER = OclPackage.VARIABLE_DECLARATION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__ID = OclPackage.VARIABLE_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__VAR_NAME = OclPackage.VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__TYPE = OclPackage.VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__INIT_EXPRESSION = OclPackage.VARIABLE_DECLARATION__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__LET_EXP = OclPackage.VARIABLE_DECLARATION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__BASE_EXP = OclPackage.VARIABLE_DECLARATION__BASE_EXP;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__VARIABLE_EXP = OclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The number of structural features of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_FEATURE_COUNT = OclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link atl.impl.InPatternElementImpl <em>In Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.InPatternElementImpl
	 * @see atl.impl.AtlPackageImpl#getInPatternElement()
	 * @generated
	 */
	int IN_PATTERN_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__LOCATION = PATTERN_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__COMMENTS_BEFORE = PATTERN_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__COMMENTS_AFTER = PATTERN_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__VAR_NAME = PATTERN_ELEMENT__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__TYPE = PATTERN_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__INIT_EXPRESSION = PATTERN_ELEMENT__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__LET_EXP = PATTERN_ELEMENT__LET_EXP;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__BASE_EXP = PATTERN_ELEMENT__BASE_EXP;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__VARIABLE_EXP = PATTERN_ELEMENT__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Maps To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__MAPS_TO = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__IN_PATTERN = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT__MODELS = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>In Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PATTERN_ELEMENT_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link atl.impl.SimpleInPatternElementImpl <em>Simple In Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.SimpleInPatternElementImpl
	 * @see atl.impl.AtlPackageImpl#getSimpleInPatternElement()
	 * @generated
	 */
	int SIMPLE_IN_PATTERN_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__LOCATION = IN_PATTERN_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__COMMENTS_BEFORE = IN_PATTERN_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__COMMENTS_AFTER = IN_PATTERN_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__ID = IN_PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__VAR_NAME = IN_PATTERN_ELEMENT__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__TYPE = IN_PATTERN_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__INIT_EXPRESSION = IN_PATTERN_ELEMENT__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__LET_EXP = IN_PATTERN_ELEMENT__LET_EXP;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__BASE_EXP = IN_PATTERN_ELEMENT__BASE_EXP;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__VARIABLE_EXP = IN_PATTERN_ELEMENT__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Maps To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__MAPS_TO = IN_PATTERN_ELEMENT__MAPS_TO;

	/**
	 * The feature id for the '<em><b>In Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__IN_PATTERN = IN_PATTERN_ELEMENT__IN_PATTERN;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT__MODELS = IN_PATTERN_ELEMENT__MODELS;

	/**
	 * The number of structural features of the '<em>Simple In Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IN_PATTERN_ELEMENT_FEATURE_COUNT = IN_PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link atl.impl.OutPatternElementImpl <em>Out Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.OutPatternElementImpl
	 * @see atl.impl.AtlPackageImpl#getOutPatternElement()
	 * @generated
	 */
	int OUT_PATTERN_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__LOCATION = PATTERN_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__COMMENTS_BEFORE = PATTERN_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__COMMENTS_AFTER = PATTERN_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__ID = PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__VAR_NAME = PATTERN_ELEMENT__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__TYPE = PATTERN_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__INIT_EXPRESSION = PATTERN_ELEMENT__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__LET_EXP = PATTERN_ELEMENT__LET_EXP;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__BASE_EXP = PATTERN_ELEMENT__BASE_EXP;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__VARIABLE_EXP = PATTERN_ELEMENT__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Out Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__OUT_PATTERN = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__SOURCE_ELEMENT = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__BINDINGS = PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT__MODEL = PATTERN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Out Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PATTERN_ELEMENT_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link atl.impl.SimpleOutPatternElementImpl <em>Simple Out Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.SimpleOutPatternElementImpl
	 * @see atl.impl.AtlPackageImpl#getSimpleOutPatternElement()
	 * @generated
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__LOCATION = OUT_PATTERN_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__COMMENTS_BEFORE = OUT_PATTERN_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__COMMENTS_AFTER = OUT_PATTERN_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__ID = OUT_PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__VAR_NAME = OUT_PATTERN_ELEMENT__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__TYPE = OUT_PATTERN_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__INIT_EXPRESSION = OUT_PATTERN_ELEMENT__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__LET_EXP = OUT_PATTERN_ELEMENT__LET_EXP;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__BASE_EXP = OUT_PATTERN_ELEMENT__BASE_EXP;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__VARIABLE_EXP = OUT_PATTERN_ELEMENT__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Out Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__OUT_PATTERN = OUT_PATTERN_ELEMENT__OUT_PATTERN;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__SOURCE_ELEMENT = OUT_PATTERN_ELEMENT__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__BINDINGS = OUT_PATTERN_ELEMENT__BINDINGS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__MODEL = OUT_PATTERN_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Reverse Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT__REVERSE_BINDINGS = OUT_PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Out Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OUT_PATTERN_ELEMENT_FEATURE_COUNT = OUT_PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atl.impl.ForEachOutPatternElementImpl <em>For Each Out Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.ForEachOutPatternElementImpl
	 * @see atl.impl.AtlPackageImpl#getForEachOutPatternElement()
	 * @generated
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__LOCATION = OUT_PATTERN_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__COMMENTS_BEFORE = OUT_PATTERN_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__COMMENTS_AFTER = OUT_PATTERN_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__ID = OUT_PATTERN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__VAR_NAME = OUT_PATTERN_ELEMENT__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__TYPE = OUT_PATTERN_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__INIT_EXPRESSION = OUT_PATTERN_ELEMENT__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__LET_EXP = OUT_PATTERN_ELEMENT__LET_EXP;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__BASE_EXP = OUT_PATTERN_ELEMENT__BASE_EXP;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__VARIABLE_EXP = OUT_PATTERN_ELEMENT__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Out Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__OUT_PATTERN = OUT_PATTERN_ELEMENT__OUT_PATTERN;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__SOURCE_ELEMENT = OUT_PATTERN_ELEMENT__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__BINDINGS = OUT_PATTERN_ELEMENT__BINDINGS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__MODEL = OUT_PATTERN_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__COLLECTION = OUT_PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT__ITERATOR = OUT_PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Each Out Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OUT_PATTERN_ELEMENT_FEATURE_COUNT = OUT_PATTERN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link atl.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.BindingImpl
	 * @see atl.impl.AtlPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 20;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Pattern Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OUT_PATTERN_ELEMENT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PROPERTY_NAME = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_ASSIGNMENT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link atl.impl.RuleVariableDeclarationImpl <em>Rule Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.RuleVariableDeclarationImpl
	 * @see atl.impl.AtlPackageImpl#getRuleVariableDeclaration()
	 * @generated
	 */
	int RULE_VARIABLE_DECLARATION = 21;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__LOCATION = OclPackage.VARIABLE_DECLARATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__COMMENTS_BEFORE = OclPackage.VARIABLE_DECLARATION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__COMMENTS_AFTER = OclPackage.VARIABLE_DECLARATION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__ID = OclPackage.VARIABLE_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__VAR_NAME = OclPackage.VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__TYPE = OclPackage.VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__INIT_EXPRESSION = OclPackage.VARIABLE_DECLARATION__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__LET_EXP = OclPackage.VARIABLE_DECLARATION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__BASE_EXP = OclPackage.VARIABLE_DECLARATION__BASE_EXP;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__VARIABLE_EXP = OclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION__RULE = OclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VARIABLE_DECLARATION_FEATURE_COUNT = OclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atl.impl.LibraryRefImpl <em>Library Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.LibraryRefImpl
	 * @see atl.impl.AtlPackageImpl#getLibraryRef()
	 * @generated
	 */
	int LIBRARY_REF = 22;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REF__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REF__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REF__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REF__UNIT = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REF__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Library Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REF_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link atl.impl.ActionBlockImpl <em>Action Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.ActionBlockImpl
	 * @see atl.impl.AtlPackageImpl#getActionBlock()
	 * @generated
	 */
	int ACTION_BLOCK = 23;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__RULE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__STATEMENTS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link atl.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.StatementImpl
	 * @see atl.impl.AtlPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 24;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link atl.impl.ExpressionStatImpl <em>Expression Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.ExpressionStatImpl
	 * @see atl.impl.AtlPackageImpl#getExpressionStat()
	 * @generated
	 */
	int EXPRESSION_STAT = 25;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STAT__LOCATION = STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STAT__COMMENTS_BEFORE = STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STAT__COMMENTS_AFTER = STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STAT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STAT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atl.impl.BindingStatImpl <em>Binding Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.BindingStatImpl
	 * @see atl.impl.AtlPackageImpl#getBindingStat()
	 * @generated
	 */
	int BINDING_STAT = 26;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STAT__LOCATION = STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STAT__COMMENTS_BEFORE = STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STAT__COMMENTS_AFTER = STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STAT__SOURCE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STAT__PROPERTY_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STAT__IS_ASSIGNMENT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STAT__VALUE = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Binding Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_STAT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link atl.impl.IfStatImpl <em>If Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.IfStatImpl
	 * @see atl.impl.AtlPackageImpl#getIfStat()
	 * @generated
	 */
	int IF_STAT = 27;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STAT__LOCATION = STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STAT__COMMENTS_BEFORE = STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STAT__COMMENTS_AFTER = STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STAT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STAT__THEN_STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STAT__ELSE_STATEMENTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STAT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link atl.impl.ForStatImpl <em>For Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atl.impl.ForStatImpl
	 * @see atl.impl.AtlPackageImpl#getForStat()
	 * @generated
	 */
	int FOR_STAT = 28;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STAT__LOCATION = STATEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STAT__COMMENTS_BEFORE = STATEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STAT__COMMENTS_AFTER = STATEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STAT__ITERATOR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STAT__COLLECTION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STAT__STATEMENTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STAT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link atl.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see atl.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link atl.LocatedElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see atl.LocatedElement#getLocation()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Location();

	/**
	 * Returns the meta object for the attribute list '{@link atl.LocatedElement#getCommentsBefore <em>Comments Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments Before</em>'.
	 * @see atl.LocatedElement#getCommentsBefore()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CommentsBefore();

	/**
	 * Returns the meta object for the attribute list '{@link atl.LocatedElement#getCommentsAfter <em>Comments After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments After</em>'.
	 * @see atl.LocatedElement#getCommentsAfter()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CommentsAfter();

	/**
	 * Returns the meta object for class '{@link atl.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see atl.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.Unit#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see atl.Unit#getLibraries()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Libraries();

	/**
	 * Returns the meta object for the attribute '{@link atl.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atl.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for class '{@link atl.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see atl.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.Library#getHelpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helpers</em>'.
	 * @see atl.Library#getHelpers()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Helpers();

	/**
	 * Returns the meta object for class '{@link atl.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see atl.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference '{@link atl.Query#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see atl.Query#getBody()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.Query#getHelpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helpers</em>'.
	 * @see atl.Query#getHelpers()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Helpers();

	/**
	 * Returns the meta object for class '{@link atl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see atl.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link atl.Module#isIsRefining <em>Is Refining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Refining</em>'.
	 * @see atl.Module#isIsRefining()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_IsRefining();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.Module#getInModels <em>In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Models</em>'.
	 * @see atl.Module#getInModels()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_InModels();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.Module#getOutModels <em>Out Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Models</em>'.
	 * @see atl.Module#getOutModels()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_OutModels();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.Module#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see atl.Module#getElements()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Elements();

	/**
	 * Returns the meta object for class '{@link atl.ModuleElement <em>Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Element</em>'.
	 * @see atl.ModuleElement
	 * @generated
	 */
	EClass getModuleElement();

	/**
	 * Returns the meta object for the container reference '{@link atl.ModuleElement#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see atl.ModuleElement#getModule()
	 * @see #getModuleElement()
	 * @generated
	 */
	EReference getModuleElement_Module();

	/**
	 * Returns the meta object for class '{@link atl.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper</em>'.
	 * @see atl.Helper
	 * @generated
	 */
	EClass getHelper();

	/**
	 * Returns the meta object for the container reference '{@link atl.Helper#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Query</em>'.
	 * @see atl.Helper#getQuery()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Query();

	/**
	 * Returns the meta object for the container reference '{@link atl.Helper#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see atl.Helper#getLibrary()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Library();

	/**
	 * Returns the meta object for the containment reference '{@link atl.Helper#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see atl.Helper#getDefinition()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Definition();

	/**
	 * Returns the meta object for class '{@link atl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see atl.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link atl.Rule#getOutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Pattern</em>'.
	 * @see atl.Rule#getOutPattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_OutPattern();

	/**
	 * Returns the meta object for the containment reference '{@link atl.Rule#getActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Block</em>'.
	 * @see atl.Rule#getActionBlock()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ActionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.Rule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see atl.Rule#getVariables()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Variables();

	/**
	 * Returns the meta object for the attribute '{@link atl.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atl.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for class '{@link atl.MatchedRule <em>Matched Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matched Rule</em>'.
	 * @see atl.MatchedRule
	 * @generated
	 */
	EClass getMatchedRule();

	/**
	 * Returns the meta object for the containment reference '{@link atl.MatchedRule#getInPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Pattern</em>'.
	 * @see atl.MatchedRule#getInPattern()
	 * @see #getMatchedRule()
	 * @generated
	 */
	EReference getMatchedRule_InPattern();

	/**
	 * Returns the meta object for the reference list '{@link atl.MatchedRule#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see atl.MatchedRule#getChildren()
	 * @see #getMatchedRule()
	 * @generated
	 */
	EReference getMatchedRule_Children();

	/**
	 * Returns the meta object for the reference '{@link atl.MatchedRule#getSuperRule <em>Super Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Rule</em>'.
	 * @see atl.MatchedRule#getSuperRule()
	 * @see #getMatchedRule()
	 * @generated
	 */
	EReference getMatchedRule_SuperRule();

	/**
	 * Returns the meta object for the attribute '{@link atl.MatchedRule#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see atl.MatchedRule#isIsAbstract()
	 * @see #getMatchedRule()
	 * @generated
	 */
	EAttribute getMatchedRule_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link atl.MatchedRule#isIsRefining <em>Is Refining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Refining</em>'.
	 * @see atl.MatchedRule#isIsRefining()
	 * @see #getMatchedRule()
	 * @generated
	 */
	EAttribute getMatchedRule_IsRefining();

	/**
	 * Returns the meta object for the attribute '{@link atl.MatchedRule#isIsNoDefault <em>Is No Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is No Default</em>'.
	 * @see atl.MatchedRule#isIsNoDefault()
	 * @see #getMatchedRule()
	 * @generated
	 */
	EAttribute getMatchedRule_IsNoDefault();

	/**
	 * Returns the meta object for class '{@link atl.LazyMatchedRule <em>Lazy Matched Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lazy Matched Rule</em>'.
	 * @see atl.LazyMatchedRule
	 * @generated
	 */
	EClass getLazyMatchedRule();

	/**
	 * Returns the meta object for the attribute '{@link atl.LazyMatchedRule#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see atl.LazyMatchedRule#isIsUnique()
	 * @see #getLazyMatchedRule()
	 * @generated
	 */
	EAttribute getLazyMatchedRule_IsUnique();

	/**
	 * Returns the meta object for class '{@link atl.CalledRule <em>Called Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Called Rule</em>'.
	 * @see atl.CalledRule
	 * @generated
	 */
	EClass getCalledRule();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.CalledRule#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see atl.CalledRule#getParameters()
	 * @see #getCalledRule()
	 * @generated
	 */
	EReference getCalledRule_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link atl.CalledRule#isIsEntrypoint <em>Is Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entrypoint</em>'.
	 * @see atl.CalledRule#isIsEntrypoint()
	 * @see #getCalledRule()
	 * @generated
	 */
	EAttribute getCalledRule_IsEntrypoint();

	/**
	 * Returns the meta object for the attribute '{@link atl.CalledRule#isIsEndpoint <em>Is Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Endpoint</em>'.
	 * @see atl.CalledRule#isIsEndpoint()
	 * @see #getCalledRule()
	 * @generated
	 */
	EAttribute getCalledRule_IsEndpoint();

	/**
	 * Returns the meta object for class '{@link atl.InPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Pattern</em>'.
	 * @see atl.InPattern
	 * @generated
	 */
	EClass getInPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.InPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see atl.InPattern#getElements()
	 * @see #getInPattern()
	 * @generated
	 */
	EReference getInPattern_Elements();

	/**
	 * Returns the meta object for the container reference '{@link atl.InPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see atl.InPattern#getRule()
	 * @see #getInPattern()
	 * @generated
	 */
	EReference getInPattern_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link atl.InPattern#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see atl.InPattern#getFilter()
	 * @see #getInPattern()
	 * @generated
	 */
	EReference getInPattern_Filter();

	/**
	 * Returns the meta object for class '{@link atl.OutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Pattern</em>'.
	 * @see atl.OutPattern
	 * @generated
	 */
	EClass getOutPattern();

	/**
	 * Returns the meta object for the container reference '{@link atl.OutPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see atl.OutPattern#getRule()
	 * @see #getOutPattern()
	 * @generated
	 */
	EReference getOutPattern_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link atl.OutPattern#getDropPattern <em>Drop Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drop Pattern</em>'.
	 * @see atl.OutPattern#getDropPattern()
	 * @see #getOutPattern()
	 * @generated
	 */
	EReference getOutPattern_DropPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.OutPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see atl.OutPattern#getElements()
	 * @see #getOutPattern()
	 * @generated
	 */
	EReference getOutPattern_Elements();

	/**
	 * Returns the meta object for class '{@link atl.DropPattern <em>Drop Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Pattern</em>'.
	 * @see atl.DropPattern
	 * @generated
	 */
	EClass getDropPattern();

	/**
	 * Returns the meta object for the container reference '{@link atl.DropPattern#getOutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Out Pattern</em>'.
	 * @see atl.DropPattern#getOutPattern()
	 * @see #getDropPattern()
	 * @generated
	 */
	EReference getDropPattern_OutPattern();

	/**
	 * Returns the meta object for class '{@link atl.PatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Element</em>'.
	 * @see atl.PatternElement
	 * @generated
	 */
	EClass getPatternElement();

	/**
	 * Returns the meta object for class '{@link atl.InPatternElement <em>In Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Pattern Element</em>'.
	 * @see atl.InPatternElement
	 * @generated
	 */
	EClass getInPatternElement();

	/**
	 * Returns the meta object for the reference '{@link atl.InPatternElement#getMapsTo <em>Maps To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps To</em>'.
	 * @see atl.InPatternElement#getMapsTo()
	 * @see #getInPatternElement()
	 * @generated
	 */
	EReference getInPatternElement_MapsTo();

	/**
	 * Returns the meta object for the container reference '{@link atl.InPatternElement#getInPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Pattern</em>'.
	 * @see atl.InPatternElement#getInPattern()
	 * @see #getInPatternElement()
	 * @generated
	 */
	EReference getInPatternElement_InPattern();

	/**
	 * Returns the meta object for the reference list '{@link atl.InPatternElement#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see atl.InPatternElement#getModels()
	 * @see #getInPatternElement()
	 * @generated
	 */
	EReference getInPatternElement_Models();

	/**
	 * Returns the meta object for class '{@link atl.SimpleInPatternElement <em>Simple In Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple In Pattern Element</em>'.
	 * @see atl.SimpleInPatternElement
	 * @generated
	 */
	EClass getSimpleInPatternElement();

	/**
	 * Returns the meta object for class '{@link atl.OutPatternElement <em>Out Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Pattern Element</em>'.
	 * @see atl.OutPatternElement
	 * @generated
	 */
	EClass getOutPatternElement();

	/**
	 * Returns the meta object for the container reference '{@link atl.OutPatternElement#getOutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Out Pattern</em>'.
	 * @see atl.OutPatternElement#getOutPattern()
	 * @see #getOutPatternElement()
	 * @generated
	 */
	EReference getOutPatternElement_OutPattern();

	/**
	 * Returns the meta object for the reference '{@link atl.OutPatternElement#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Element</em>'.
	 * @see atl.OutPatternElement#getSourceElement()
	 * @see #getOutPatternElement()
	 * @generated
	 */
	EReference getOutPatternElement_SourceElement();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.OutPatternElement#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see atl.OutPatternElement#getBindings()
	 * @see #getOutPatternElement()
	 * @generated
	 */
	EReference getOutPatternElement_Bindings();

	/**
	 * Returns the meta object for the reference '{@link atl.OutPatternElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see atl.OutPatternElement#getModel()
	 * @see #getOutPatternElement()
	 * @generated
	 */
	EReference getOutPatternElement_Model();

	/**
	 * Returns the meta object for class '{@link atl.SimpleOutPatternElement <em>Simple Out Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Out Pattern Element</em>'.
	 * @see atl.SimpleOutPatternElement
	 * @generated
	 */
	EClass getSimpleOutPatternElement();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.SimpleOutPatternElement#getReverseBindings <em>Reverse Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reverse Bindings</em>'.
	 * @see atl.SimpleOutPatternElement#getReverseBindings()
	 * @see #getSimpleOutPatternElement()
	 * @generated
	 */
	EReference getSimpleOutPatternElement_ReverseBindings();

	/**
	 * Returns the meta object for class '{@link atl.ForEachOutPatternElement <em>For Each Out Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each Out Pattern Element</em>'.
	 * @see atl.ForEachOutPatternElement
	 * @generated
	 */
	EClass getForEachOutPatternElement();

	/**
	 * Returns the meta object for the containment reference '{@link atl.ForEachOutPatternElement#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see atl.ForEachOutPatternElement#getCollection()
	 * @see #getForEachOutPatternElement()
	 * @generated
	 */
	EReference getForEachOutPatternElement_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link atl.ForEachOutPatternElement#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator</em>'.
	 * @see atl.ForEachOutPatternElement#getIterator()
	 * @see #getForEachOutPatternElement()
	 * @generated
	 */
	EReference getForEachOutPatternElement_Iterator();

	/**
	 * Returns the meta object for class '{@link atl.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see atl.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the containment reference '{@link atl.Binding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see atl.Binding#getValue()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Value();

	/**
	 * Returns the meta object for the container reference '{@link atl.Binding#getOutPatternElement <em>Out Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Out Pattern Element</em>'.
	 * @see atl.Binding#getOutPatternElement()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_OutPatternElement();

	/**
	 * Returns the meta object for the attribute '{@link atl.Binding#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see atl.Binding#getPropertyName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link atl.Binding#isIsAssignment <em>Is Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Assignment</em>'.
	 * @see atl.Binding#isIsAssignment()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_IsAssignment();

	/**
	 * Returns the meta object for class '{@link atl.RuleVariableDeclaration <em>Rule Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Variable Declaration</em>'.
	 * @see atl.RuleVariableDeclaration
	 * @generated
	 */
	EClass getRuleVariableDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link atl.RuleVariableDeclaration#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see atl.RuleVariableDeclaration#getRule()
	 * @see #getRuleVariableDeclaration()
	 * @generated
	 */
	EReference getRuleVariableDeclaration_Rule();

	/**
	 * Returns the meta object for class '{@link atl.LibraryRef <em>Library Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Ref</em>'.
	 * @see atl.LibraryRef
	 * @generated
	 */
	EClass getLibraryRef();

	/**
	 * Returns the meta object for the container reference '{@link atl.LibraryRef#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unit</em>'.
	 * @see atl.LibraryRef#getUnit()
	 * @see #getLibraryRef()
	 * @generated
	 */
	EReference getLibraryRef_Unit();

	/**
	 * Returns the meta object for the attribute '{@link atl.LibraryRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atl.LibraryRef#getName()
	 * @see #getLibraryRef()
	 * @generated
	 */
	EAttribute getLibraryRef_Name();

	/**
	 * Returns the meta object for class '{@link atl.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Block</em>'.
	 * @see atl.ActionBlock
	 * @generated
	 */
	EClass getActionBlock();

	/**
	 * Returns the meta object for the container reference '{@link atl.ActionBlock#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see atl.ActionBlock#getRule()
	 * @see #getActionBlock()
	 * @generated
	 */
	EReference getActionBlock_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.ActionBlock#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see atl.ActionBlock#getStatements()
	 * @see #getActionBlock()
	 * @generated
	 */
	EReference getActionBlock_Statements();

	/**
	 * Returns the meta object for class '{@link atl.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see atl.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link atl.ExpressionStat <em>Expression Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Stat</em>'.
	 * @see atl.ExpressionStat
	 * @generated
	 */
	EClass getExpressionStat();

	/**
	 * Returns the meta object for the containment reference '{@link atl.ExpressionStat#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see atl.ExpressionStat#getExpression()
	 * @see #getExpressionStat()
	 * @generated
	 */
	EReference getExpressionStat_Expression();

	/**
	 * Returns the meta object for class '{@link atl.BindingStat <em>Binding Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Stat</em>'.
	 * @see atl.BindingStat
	 * @generated
	 */
	EClass getBindingStat();

	/**
	 * Returns the meta object for the containment reference '{@link atl.BindingStat#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see atl.BindingStat#getSource()
	 * @see #getBindingStat()
	 * @generated
	 */
	EReference getBindingStat_Source();

	/**
	 * Returns the meta object for the attribute '{@link atl.BindingStat#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see atl.BindingStat#getPropertyName()
	 * @see #getBindingStat()
	 * @generated
	 */
	EAttribute getBindingStat_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link atl.BindingStat#isIsAssignment <em>Is Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Assignment</em>'.
	 * @see atl.BindingStat#isIsAssignment()
	 * @see #getBindingStat()
	 * @generated
	 */
	EAttribute getBindingStat_IsAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link atl.BindingStat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see atl.BindingStat#getValue()
	 * @see #getBindingStat()
	 * @generated
	 */
	EReference getBindingStat_Value();

	/**
	 * Returns the meta object for class '{@link atl.IfStat <em>If Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Stat</em>'.
	 * @see atl.IfStat
	 * @generated
	 */
	EClass getIfStat();

	/**
	 * Returns the meta object for the containment reference '{@link atl.IfStat#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see atl.IfStat#getCondition()
	 * @see #getIfStat()
	 * @generated
	 */
	EReference getIfStat_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.IfStat#getThenStatements <em>Then Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then Statements</em>'.
	 * @see atl.IfStat#getThenStatements()
	 * @see #getIfStat()
	 * @generated
	 */
	EReference getIfStat_ThenStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.IfStat#getElseStatements <em>Else Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Statements</em>'.
	 * @see atl.IfStat#getElseStatements()
	 * @see #getIfStat()
	 * @generated
	 */
	EReference getIfStat_ElseStatements();

	/**
	 * Returns the meta object for class '{@link atl.ForStat <em>For Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Stat</em>'.
	 * @see atl.ForStat
	 * @generated
	 */
	EClass getForStat();

	/**
	 * Returns the meta object for the containment reference '{@link atl.ForStat#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator</em>'.
	 * @see atl.ForStat#getIterator()
	 * @see #getForStat()
	 * @generated
	 */
	EReference getForStat_Iterator();

	/**
	 * Returns the meta object for the containment reference '{@link atl.ForStat#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see atl.ForStat#getCollection()
	 * @see #getForStat()
	 * @generated
	 */
	EReference getForStat_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link atl.ForStat#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see atl.ForStat#getStatements()
	 * @see #getForStat()
	 * @generated
	 */
	EReference getForStat_Statements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtlFactory getAtlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link atl.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.LocatedElementImpl
		 * @see atl.impl.AtlPackageImpl#getLocatedElement()
		 * @generated
		 */
		EClass LOCATED_ELEMENT = eINSTANCE.getLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__LOCATION = eINSTANCE.getLocatedElement_Location();

		/**
		 * The meta object literal for the '<em><b>Comments Before</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COMMENTS_BEFORE = eINSTANCE.getLocatedElement_CommentsBefore();

		/**
		 * The meta object literal for the '<em><b>Comments After</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COMMENTS_AFTER = eINSTANCE.getLocatedElement_CommentsAfter();

		/**
		 * The meta object literal for the '{@link atl.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.UnitImpl
		 * @see atl.impl.AtlPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__LIBRARIES = eINSTANCE.getUnit_Libraries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '{@link atl.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.LibraryImpl
		 * @see atl.impl.AtlPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Helpers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__HELPERS = eINSTANCE.getLibrary_Helpers();

		/**
		 * The meta object literal for the '{@link atl.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.QueryImpl
		 * @see atl.impl.AtlPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__BODY = eINSTANCE.getQuery_Body();

		/**
		 * The meta object literal for the '<em><b>Helpers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__HELPERS = eINSTANCE.getQuery_Helpers();

		/**
		 * The meta object literal for the '{@link atl.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.ModuleImpl
		 * @see atl.impl.AtlPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Is Refining</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IS_REFINING = eINSTANCE.getModule_IsRefining();

		/**
		 * The meta object literal for the '<em><b>In Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__IN_MODELS = eINSTANCE.getModule_InModels();

		/**
		 * The meta object literal for the '<em><b>Out Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OUT_MODELS = eINSTANCE.getModule_OutModels();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ELEMENTS = eINSTANCE.getModule_Elements();

		/**
		 * The meta object literal for the '{@link atl.impl.ModuleElementImpl <em>Module Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.ModuleElementImpl
		 * @see atl.impl.AtlPackageImpl#getModuleElement()
		 * @generated
		 */
		EClass MODULE_ELEMENT = eINSTANCE.getModuleElement();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_ELEMENT__MODULE = eINSTANCE.getModuleElement_Module();

		/**
		 * The meta object literal for the '{@link atl.impl.HelperImpl <em>Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.HelperImpl
		 * @see atl.impl.AtlPackageImpl#getHelper()
		 * @generated
		 */
		EClass HELPER = eINSTANCE.getHelper();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER__QUERY = eINSTANCE.getHelper_Query();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER__LIBRARY = eINSTANCE.getHelper_Library();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER__DEFINITION = eINSTANCE.getHelper_Definition();

		/**
		 * The meta object literal for the '{@link atl.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.RuleImpl
		 * @see atl.impl.AtlPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Out Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__OUT_PATTERN = eINSTANCE.getRule_OutPattern();

		/**
		 * The meta object literal for the '<em><b>Action Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ACTION_BLOCK = eINSTANCE.getRule_ActionBlock();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__VARIABLES = eINSTANCE.getRule_Variables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '{@link atl.impl.MatchedRuleImpl <em>Matched Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.MatchedRuleImpl
		 * @see atl.impl.AtlPackageImpl#getMatchedRule()
		 * @generated
		 */
		EClass MATCHED_RULE = eINSTANCE.getMatchedRule();

		/**
		 * The meta object literal for the '<em><b>In Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_RULE__IN_PATTERN = eINSTANCE.getMatchedRule_InPattern();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_RULE__CHILDREN = eINSTANCE.getMatchedRule_Children();

		/**
		 * The meta object literal for the '<em><b>Super Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_RULE__SUPER_RULE = eINSTANCE.getMatchedRule_SuperRule();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHED_RULE__IS_ABSTRACT = eINSTANCE.getMatchedRule_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Refining</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHED_RULE__IS_REFINING = eINSTANCE.getMatchedRule_IsRefining();

		/**
		 * The meta object literal for the '<em><b>Is No Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHED_RULE__IS_NO_DEFAULT = eINSTANCE.getMatchedRule_IsNoDefault();

		/**
		 * The meta object literal for the '{@link atl.impl.LazyMatchedRuleImpl <em>Lazy Matched Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.LazyMatchedRuleImpl
		 * @see atl.impl.AtlPackageImpl#getLazyMatchedRule()
		 * @generated
		 */
		EClass LAZY_MATCHED_RULE = eINSTANCE.getLazyMatchedRule();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_MATCHED_RULE__IS_UNIQUE = eINSTANCE.getLazyMatchedRule_IsUnique();

		/**
		 * The meta object literal for the '{@link atl.impl.CalledRuleImpl <em>Called Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.CalledRuleImpl
		 * @see atl.impl.AtlPackageImpl#getCalledRule()
		 * @generated
		 */
		EClass CALLED_RULE = eINSTANCE.getCalledRule();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLED_RULE__PARAMETERS = eINSTANCE.getCalledRule_Parameters();

		/**
		 * The meta object literal for the '<em><b>Is Entrypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLED_RULE__IS_ENTRYPOINT = eINSTANCE.getCalledRule_IsEntrypoint();

		/**
		 * The meta object literal for the '<em><b>Is Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLED_RULE__IS_ENDPOINT = eINSTANCE.getCalledRule_IsEndpoint();

		/**
		 * The meta object literal for the '{@link atl.impl.InPatternImpl <em>In Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.InPatternImpl
		 * @see atl.impl.AtlPackageImpl#getInPattern()
		 * @generated
		 */
		EClass IN_PATTERN = eINSTANCE.getInPattern();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PATTERN__ELEMENTS = eINSTANCE.getInPattern_Elements();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PATTERN__RULE = eINSTANCE.getInPattern_Rule();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PATTERN__FILTER = eINSTANCE.getInPattern_Filter();

		/**
		 * The meta object literal for the '{@link atl.impl.OutPatternImpl <em>Out Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.OutPatternImpl
		 * @see atl.impl.AtlPackageImpl#getOutPattern()
		 * @generated
		 */
		EClass OUT_PATTERN = eINSTANCE.getOutPattern();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PATTERN__RULE = eINSTANCE.getOutPattern_Rule();

		/**
		 * The meta object literal for the '<em><b>Drop Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PATTERN__DROP_PATTERN = eINSTANCE.getOutPattern_DropPattern();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PATTERN__ELEMENTS = eINSTANCE.getOutPattern_Elements();

		/**
		 * The meta object literal for the '{@link atl.impl.DropPatternImpl <em>Drop Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.DropPatternImpl
		 * @see atl.impl.AtlPackageImpl#getDropPattern()
		 * @generated
		 */
		EClass DROP_PATTERN = eINSTANCE.getDropPattern();

		/**
		 * The meta object literal for the '<em><b>Out Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_PATTERN__OUT_PATTERN = eINSTANCE.getDropPattern_OutPattern();

		/**
		 * The meta object literal for the '{@link atl.impl.PatternElementImpl <em>Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.PatternElementImpl
		 * @see atl.impl.AtlPackageImpl#getPatternElement()
		 * @generated
		 */
		EClass PATTERN_ELEMENT = eINSTANCE.getPatternElement();

		/**
		 * The meta object literal for the '{@link atl.impl.InPatternElementImpl <em>In Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.InPatternElementImpl
		 * @see atl.impl.AtlPackageImpl#getInPatternElement()
		 * @generated
		 */
		EClass IN_PATTERN_ELEMENT = eINSTANCE.getInPatternElement();

		/**
		 * The meta object literal for the '<em><b>Maps To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PATTERN_ELEMENT__MAPS_TO = eINSTANCE.getInPatternElement_MapsTo();

		/**
		 * The meta object literal for the '<em><b>In Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PATTERN_ELEMENT__IN_PATTERN = eINSTANCE.getInPatternElement_InPattern();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PATTERN_ELEMENT__MODELS = eINSTANCE.getInPatternElement_Models();

		/**
		 * The meta object literal for the '{@link atl.impl.SimpleInPatternElementImpl <em>Simple In Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.SimpleInPatternElementImpl
		 * @see atl.impl.AtlPackageImpl#getSimpleInPatternElement()
		 * @generated
		 */
		EClass SIMPLE_IN_PATTERN_ELEMENT = eINSTANCE.getSimpleInPatternElement();

		/**
		 * The meta object literal for the '{@link atl.impl.OutPatternElementImpl <em>Out Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.OutPatternElementImpl
		 * @see atl.impl.AtlPackageImpl#getOutPatternElement()
		 * @generated
		 */
		EClass OUT_PATTERN_ELEMENT = eINSTANCE.getOutPatternElement();

		/**
		 * The meta object literal for the '<em><b>Out Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PATTERN_ELEMENT__OUT_PATTERN = eINSTANCE.getOutPatternElement_OutPattern();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PATTERN_ELEMENT__SOURCE_ELEMENT = eINSTANCE.getOutPatternElement_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PATTERN_ELEMENT__BINDINGS = eINSTANCE.getOutPatternElement_Bindings();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PATTERN_ELEMENT__MODEL = eINSTANCE.getOutPatternElement_Model();

		/**
		 * The meta object literal for the '{@link atl.impl.SimpleOutPatternElementImpl <em>Simple Out Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.SimpleOutPatternElementImpl
		 * @see atl.impl.AtlPackageImpl#getSimpleOutPatternElement()
		 * @generated
		 */
		EClass SIMPLE_OUT_PATTERN_ELEMENT = eINSTANCE.getSimpleOutPatternElement();

		/**
		 * The meta object literal for the '<em><b>Reverse Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_OUT_PATTERN_ELEMENT__REVERSE_BINDINGS = eINSTANCE.getSimpleOutPatternElement_ReverseBindings();

		/**
		 * The meta object literal for the '{@link atl.impl.ForEachOutPatternElementImpl <em>For Each Out Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.ForEachOutPatternElementImpl
		 * @see atl.impl.AtlPackageImpl#getForEachOutPatternElement()
		 * @generated
		 */
		EClass FOR_EACH_OUT_PATTERN_ELEMENT = eINSTANCE.getForEachOutPatternElement();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_OUT_PATTERN_ELEMENT__COLLECTION = eINSTANCE.getForEachOutPatternElement_Collection();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_OUT_PATTERN_ELEMENT__ITERATOR = eINSTANCE.getForEachOutPatternElement_Iterator();

		/**
		 * The meta object literal for the '{@link atl.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.BindingImpl
		 * @see atl.impl.AtlPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__VALUE = eINSTANCE.getBinding_Value();

		/**
		 * The meta object literal for the '<em><b>Out Pattern Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__OUT_PATTERN_ELEMENT = eINSTANCE.getBinding_OutPatternElement();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__PROPERTY_NAME = eINSTANCE.getBinding_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Is Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__IS_ASSIGNMENT = eINSTANCE.getBinding_IsAssignment();

		/**
		 * The meta object literal for the '{@link atl.impl.RuleVariableDeclarationImpl <em>Rule Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.RuleVariableDeclarationImpl
		 * @see atl.impl.AtlPackageImpl#getRuleVariableDeclaration()
		 * @generated
		 */
		EClass RULE_VARIABLE_DECLARATION = eINSTANCE.getRuleVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_VARIABLE_DECLARATION__RULE = eINSTANCE.getRuleVariableDeclaration_Rule();

		/**
		 * The meta object literal for the '{@link atl.impl.LibraryRefImpl <em>Library Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.LibraryRefImpl
		 * @see atl.impl.AtlPackageImpl#getLibraryRef()
		 * @generated
		 */
		EClass LIBRARY_REF = eINSTANCE.getLibraryRef();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_REF__UNIT = eINSTANCE.getLibraryRef_Unit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY_REF__NAME = eINSTANCE.getLibraryRef_Name();

		/**
		 * The meta object literal for the '{@link atl.impl.ActionBlockImpl <em>Action Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.ActionBlockImpl
		 * @see atl.impl.AtlPackageImpl#getActionBlock()
		 * @generated
		 */
		EClass ACTION_BLOCK = eINSTANCE.getActionBlock();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BLOCK__RULE = eINSTANCE.getActionBlock_Rule();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BLOCK__STATEMENTS = eINSTANCE.getActionBlock_Statements();

		/**
		 * The meta object literal for the '{@link atl.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.StatementImpl
		 * @see atl.impl.AtlPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link atl.impl.ExpressionStatImpl <em>Expression Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.ExpressionStatImpl
		 * @see atl.impl.AtlPackageImpl#getExpressionStat()
		 * @generated
		 */
		EClass EXPRESSION_STAT = eINSTANCE.getExpressionStat();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_STAT__EXPRESSION = eINSTANCE.getExpressionStat_Expression();

		/**
		 * The meta object literal for the '{@link atl.impl.BindingStatImpl <em>Binding Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.BindingStatImpl
		 * @see atl.impl.AtlPackageImpl#getBindingStat()
		 * @generated
		 */
		EClass BINDING_STAT = eINSTANCE.getBindingStat();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_STAT__SOURCE = eINSTANCE.getBindingStat_Source();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_STAT__PROPERTY_NAME = eINSTANCE.getBindingStat_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Is Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_STAT__IS_ASSIGNMENT = eINSTANCE.getBindingStat_IsAssignment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_STAT__VALUE = eINSTANCE.getBindingStat_Value();

		/**
		 * The meta object literal for the '{@link atl.impl.IfStatImpl <em>If Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.IfStatImpl
		 * @see atl.impl.AtlPackageImpl#getIfStat()
		 * @generated
		 */
		EClass IF_STAT = eINSTANCE.getIfStat();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STAT__CONDITION = eINSTANCE.getIfStat_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STAT__THEN_STATEMENTS = eINSTANCE.getIfStat_ThenStatements();

		/**
		 * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STAT__ELSE_STATEMENTS = eINSTANCE.getIfStat_ElseStatements();

		/**
		 * The meta object literal for the '{@link atl.impl.ForStatImpl <em>For Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atl.impl.ForStatImpl
		 * @see atl.impl.AtlPackageImpl#getForStat()
		 * @generated
		 */
		EClass FOR_STAT = eINSTANCE.getForStat();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STAT__ITERATOR = eINSTANCE.getForStat_Iterator();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STAT__COLLECTION = eINSTANCE.getForStat_Collection();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STAT__STATEMENTS = eINSTANCE.getForStat_Statements();

	}

} //AtlPackage
