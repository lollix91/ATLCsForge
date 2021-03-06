/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myAtl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Variable CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myAtl.LetVariableCS#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.LetVariableCS#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.LetVariableCS#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getLetVariableCS()
 * @model
 * @generated
 */
public interface LetVariableCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getLetVariableCS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.LetVariableCS#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owned Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Type</em>' containment reference.
   * @see #setOwnedType(TypeExpCS)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getLetVariableCS_OwnedType()
   * @model containment="true"
   * @generated
   */
  TypeExpCS getOwnedType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.LetVariableCS#getOwnedType <em>Owned Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Type</em>' containment reference.
   * @see #getOwnedType()
   * @generated
   */
  void setOwnedType(TypeExpCS value);

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
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getLetVariableCS_InitExpression()
   * @model containment="true"
   * @generated
   */
  ExpCS getInitExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.LetVariableCS#getInitExpression <em>Init Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Expression</em>' containment reference.
   * @see #getInitExpression()
   * @generated
   */
  void setInitExpression(ExpCS value);

} // LetVariableCS
