/**
 */
package ocl;

import atl.LocatedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.OclContextDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link ocl.OclContextDefinition#getContext_ <em>Context </em>}</li>
 * </ul>
 *
 * @see ocl.OclPackage#getOclContextDefinition()
 * @model
 * @generated
 */
public interface OclContextDefinition extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ocl.OclFeatureDefinition#getContext_ <em>Context </em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' container reference.
	 * @see #setDefinition(OclFeatureDefinition)
	 * @see ocl.OclPackage#getOclContextDefinition_Definition()
	 * @see ocl.OclFeatureDefinition#getContext_
	 * @model opposite="context_" required="true" transient="false" ordered="false"
	 * @generated
	 */
	OclFeatureDefinition getDefinition();

	/**
	 * Sets the value of the '{@link ocl.OclContextDefinition#getDefinition <em>Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' container reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(OclFeatureDefinition value);

	/**
	 * Returns the value of the '<em><b>Context </b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ocl.OclType#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context </em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context </em>' containment reference.
	 * @see #setContext_(OclType)
	 * @see ocl.OclPackage#getOclContextDefinition_Context_()
	 * @see ocl.OclType#getDefinitions
	 * @model opposite="definitions" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclType getContext_();

	/**
	 * Sets the value of the '{@link ocl.OclContextDefinition#getContext_ <em>Context </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context </em>' containment reference.
	 * @see #getContext_()
	 * @generated
	 */
	void setContext_(OclType value);

} // OclContextDefinition
