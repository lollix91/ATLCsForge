/**
 */
package ocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.Iterator#getLoopExpr <em>Loop Expr</em>}</li>
 * </ul>
 *
 * @see ocl.OclPackage#getIterator()
 * @model
 * @generated
 */
public interface Iterator extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Loop Expr</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ocl.LoopExp#getIterators <em>Iterators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Expr</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Expr</em>' container reference.
	 * @see #setLoopExpr(LoopExp)
	 * @see ocl.OclPackage#getIterator_LoopExpr()
	 * @see ocl.LoopExp#getIterators
	 * @model opposite="iterators" transient="false" ordered="false"
	 * @generated
	 */
	LoopExp getLoopExpr();

	/**
	 * Sets the value of the '{@link ocl.Iterator#getLoopExpr <em>Loop Expr</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Expr</em>' container reference.
	 * @see #getLoopExpr()
	 * @generated
	 */
	void setLoopExpr(LoopExp value);

} // Iterator
