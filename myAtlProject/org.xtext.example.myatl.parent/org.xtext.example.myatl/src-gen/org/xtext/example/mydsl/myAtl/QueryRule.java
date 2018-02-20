/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myAtl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myAtl.QueryRule#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.QueryRule#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getQueryRule()
 * @model
 * @generated
 */
public interface QueryRule extends ModuleElement
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myAtl.ATLParameterCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getQueryRule_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ATLParameterCS> getParameters();

  /**
   * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Expression</em>' containment reference.
   * @see #setInitExpression(ExpCS)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getQueryRule_InitExpression()
   * @model containment="true"
   * @generated
   */
  ExpCS getInitExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.QueryRule#getInitExpression <em>Init Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Expression</em>' containment reference.
   * @see #getInitExpression()
   * @generated
   */
  void setInitExpression(ExpCS value);

} // QueryRule