/**
 */
package atl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atl.DropPattern#getOutPattern <em>Out Pattern</em>}</li>
 * </ul>
 *
 * @see atl.AtlPackage#getDropPattern()
 * @model
 * @generated
 */
public interface DropPattern extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Out Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atl.OutPattern#getDropPattern <em>Drop Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Pattern</em>' container reference.
	 * @see #setOutPattern(OutPattern)
	 * @see atl.AtlPackage#getDropPattern_OutPattern()
	 * @see atl.OutPattern#getDropPattern
	 * @model opposite="dropPattern" required="true" transient="false" ordered="false"
	 * @generated
	 */
	OutPattern getOutPattern();

	/**
	 * Sets the value of the '{@link atl.DropPattern#getOutPattern <em>Out Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Pattern</em>' container reference.
	 * @see #getOutPattern()
	 * @generated
	 */
	void setOutPattern(OutPattern value);

} // DropPattern
