/**
 */
package atl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atl.Library#getHelpers <em>Helpers</em>}</li>
 * </ul>
 *
 * @see atl.AtlPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends Unit {
	/**
	 * Returns the value of the '<em><b>Helpers</b></em>' containment reference list.
	 * The list contents are of type {@link atl.Helper}.
	 * It is bidirectional and its opposite is '{@link atl.Helper#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helpers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helpers</em>' containment reference list.
	 * @see atl.AtlPackage#getLibrary_Helpers()
	 * @see atl.Helper#getLibrary
	 * @model opposite="library" containment="true"
	 * @generated
	 */
	EList<Helper> getHelpers();

} // Library
