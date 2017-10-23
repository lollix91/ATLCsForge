/**
 */
package atl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atl.OutPattern#getRule <em>Rule</em>}</li>
 *   <li>{@link atl.OutPattern#getDropPattern <em>Drop Pattern</em>}</li>
 *   <li>{@link atl.OutPattern#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see atl.AtlPackage#getOutPattern()
 * @model
 * @generated
 */
public interface OutPattern extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atl.Rule#getOutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see atl.AtlPackage#getOutPattern_Rule()
	 * @see atl.Rule#getOutPattern
	 * @model opposite="outPattern" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link atl.OutPattern#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Drop Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link atl.DropPattern#getOutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Pattern</em>' containment reference.
	 * @see #setDropPattern(DropPattern)
	 * @see atl.AtlPackage#getOutPattern_DropPattern()
	 * @see atl.DropPattern#getOutPattern
	 * @model opposite="outPattern" containment="true" ordered="false"
	 * @generated
	 */
	DropPattern getDropPattern();

	/**
	 * Sets the value of the '{@link atl.OutPattern#getDropPattern <em>Drop Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Pattern</em>' containment reference.
	 * @see #getDropPattern()
	 * @generated
	 */
	void setDropPattern(DropPattern value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link atl.OutPatternElement}.
	 * It is bidirectional and its opposite is '{@link atl.OutPatternElement#getOutPattern <em>Out Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see atl.AtlPackage#getOutPattern_Elements()
	 * @see atl.OutPatternElement#getOutPattern
	 * @model opposite="outPattern" containment="true" required="true"
	 * @generated
	 */
	EList<OutPatternElement> getElements();

} // OutPattern
