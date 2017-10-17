/**
 */
package atl;

import ocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atl.Query#getBody <em>Body</em>}</li>
 *   <li>{@link atl.Query#getHelpers <em>Helpers</em>}</li>
 * </ul>
 *
 * @see atl.AtlPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends Unit {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see atl.AtlPackage#getQuery_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getBody();

	/**
	 * Sets the value of the '{@link atl.Query#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Helpers</b></em>' containment reference list.
	 * The list contents are of type {@link atl.Helper}.
	 * It is bidirectional and its opposite is '{@link atl.Helper#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helpers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helpers</em>' containment reference list.
	 * @see atl.AtlPackage#getQuery_Helpers()
	 * @see atl.Helper#getQuery
	 * @model opposite="query" containment="true"
	 * @generated
	 */
	EList<Helper> getHelpers();

} // Query
