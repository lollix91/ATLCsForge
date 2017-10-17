/**
 */
package ocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.OclModelElement#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see ocl.OclPackage#getOclModelElement()
 * @model
 * @generated
 */
public interface OclModelElement extends OclType {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ocl.OclModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(OclModel)
	 * @see ocl.OclPackage#getOclModelElement_Model()
	 * @see ocl.OclModel#getElements
	 * @model opposite="elements" required="true" ordered="false"
	 * @generated
	 */
	OclModel getModel();

	/**
	 * Sets the value of the '{@link ocl.OclModelElement#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(OclModel value);

} // OclModelElement
