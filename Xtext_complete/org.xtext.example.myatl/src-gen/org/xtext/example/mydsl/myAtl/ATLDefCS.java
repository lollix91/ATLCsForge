/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myAtl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl.myOcl.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATL Def CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myAtl.ATLDefCS#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.ATLDefCS#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.ATLDefCS#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.ATLDefCS#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getATLDefCS()
 * @model
 * @generated
 */
public interface ATLDefCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getATLDefCS_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.ATLDefCS#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

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
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getATLDefCS_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ATLParameterCS> getParameters();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ATLType)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getATLDefCS_Type()
   * @model containment="true"
   * @generated
   */
  ATLType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.ATLDefCS#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ATLType value);

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
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getATLDefCS_InitExpression()
   * @model containment="true"
   * @generated
   */
  ExpCS getInitExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.ATLDefCS#getInitExpression <em>Init Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Expression</em>' containment reference.
   * @see #getInitExpression()
   * @generated
   */
  void setInitExpression(ExpCS value);

} // ATLDefCS