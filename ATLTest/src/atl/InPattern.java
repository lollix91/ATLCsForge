/**
 */
package atl;

import ocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atl.InPattern#getElements <em>Elements</em>}</li>
 *   <li>{@link atl.InPattern#getRule <em>Rule</em>}</li>
 *   <li>{@link atl.InPattern#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see atl.AtlPackage#getInPattern()
 * @model
 * @generated
 */
public interface InPattern extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link atl.InPatternElement}.
	 * It is bidirectional and its opposite is '{@link atl.InPatternElement#getInPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see atl.AtlPackage#getInPattern_Elements()
	 * @see atl.InPatternElement#getInPattern
	 * @model opposite="inPattern" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<InPatternElement> getElements();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atl.MatchedRule#getInPattern <em>In Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(MatchedRule)
	 * @see atl.AtlPackage#getInPattern_Rule()
	 * @see atl.MatchedRule#getInPattern
	 * @model opposite="inPattern" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MatchedRule getRule();

	/**
	 * Sets the value of the '{@link atl.InPattern#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(MatchedRule value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(OclExpression)
	 * @see atl.AtlPackage#getInPattern_Filter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OclExpression getFilter();

	/**
	 * Sets the value of the '{@link atl.InPattern#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(OclExpression value);

} // InPattern
