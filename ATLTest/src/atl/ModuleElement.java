/**
 */
package atl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atl.ModuleElement#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see atl.AtlPackage#getModuleElement()
 * @model abstract="true"
 * @generated
 */
public interface ModuleElement extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atl.Module#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see atl.AtlPackage#getModuleElement_Module()
	 * @see atl.Module#getElements
	 * @model opposite="elements" transient="false" ordered="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link atl.ModuleElement#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // ModuleElement
