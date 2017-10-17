/**
 */
package ocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.RealExp#getRealSymbol <em>Real Symbol</em>}</li>
 * </ul>
 *
 * @see ocl.OclPackage#getRealExp()
 * @model
 * @generated
 */
public interface RealExp extends NumericExp {
	/**
	 * Returns the value of the '<em><b>Real Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Symbol</em>' attribute.
	 * @see #setRealSymbol(double)
	 * @see ocl.OclPackage#getRealExp_RealSymbol()
	 * @model unique="false" dataType="PrimitiveTypes.Double" required="true" ordered="false"
	 * @generated
	 */
	double getRealSymbol();

	/**
	 * Sets the value of the '{@link ocl.RealExp#getRealSymbol <em>Real Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Symbol</em>' attribute.
	 * @see #getRealSymbol()
	 * @generated
	 */
	void setRealSymbol(double value);

} // RealExp
