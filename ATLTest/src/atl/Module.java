/**
 */
package atl;

import ocl.OclModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atl.Module#isIsRefining <em>Is Refining</em>}</li>
 *   <li>{@link atl.Module#getInModels <em>In Models</em>}</li>
 *   <li>{@link atl.Module#getOutModels <em>Out Models</em>}</li>
 *   <li>{@link atl.Module#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see atl.AtlPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Unit {
	/**
	 * Returns the value of the '<em><b>Is Refining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Refining</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Refining</em>' attribute.
	 * @see #setIsRefining(boolean)
	 * @see atl.AtlPackage#getModule_IsRefining()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRefining();

	/**
	 * Sets the value of the '{@link atl.Module#isIsRefining <em>Is Refining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Refining</em>' attribute.
	 * @see #isIsRefining()
	 * @generated
	 */
	void setIsRefining(boolean value);

	/**
	 * Returns the value of the '<em><b>In Models</b></em>' containment reference list.
	 * The list contents are of type {@link ocl.OclModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Models</em>' containment reference list.
	 * @see atl.AtlPackage#getModule_InModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OclModel> getInModels();

	/**
	 * Returns the value of the '<em><b>Out Models</b></em>' containment reference list.
	 * The list contents are of type {@link ocl.OclModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Models</em>' containment reference list.
	 * @see atl.AtlPackage#getModule_OutModels()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<OclModel> getOutModels();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link atl.ModuleElement}.
	 * It is bidirectional and its opposite is '{@link atl.ModuleElement#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see atl.AtlPackage#getModule_Elements()
	 * @see atl.ModuleElement#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<ModuleElement> getElements();

} // Module
