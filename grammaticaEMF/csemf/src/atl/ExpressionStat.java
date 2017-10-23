/**
 */
package atl;

import ocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atl.ExpressionStat#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see atl.AtlPackage#getExpressionStat()
 * @model
 * @generated
 */
public interface ExpressionStat extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(OclExpression)
	 * @see atl.AtlPackage#getExpressionStat_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getExpression();

	/**
	 * Sets the value of the '{@link atl.ExpressionStat#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(OclExpression value);

} // ExpressionStat
