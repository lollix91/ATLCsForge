/**
 */
package ocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.CollectionType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see ocl.OclPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends OclType {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ocl.OclType#getCollectionTypes <em>Collection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(OclType)
	 * @see ocl.OclPackage#getCollectionType_ElementType()
	 * @see ocl.OclType#getCollectionTypes
	 * @model opposite="collectionTypes" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclType getElementType();

	/**
	 * Sets the value of the '{@link ocl.CollectionType#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(OclType value);

} // CollectionType
