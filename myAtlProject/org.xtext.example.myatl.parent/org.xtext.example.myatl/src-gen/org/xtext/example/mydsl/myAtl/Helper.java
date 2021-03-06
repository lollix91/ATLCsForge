/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myAtl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myAtl.Helper#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getHelper()
 * @model
 * @generated
 */
public interface Helper extends ModuleElement
{
  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(ATLDefCS)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getHelper_Definition()
   * @model containment="true"
   * @generated
   */
  ATLDefCS getDefinition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.Helper#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(ATLDefCS value);

} // Helper
