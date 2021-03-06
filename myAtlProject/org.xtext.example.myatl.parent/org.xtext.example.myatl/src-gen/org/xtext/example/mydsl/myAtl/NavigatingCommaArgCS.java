/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myAtl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigating Comma Arg CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myAtl.NavigatingCommaArgCS#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.NavigatingCommaArgCS#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.NavigatingCommaArgCS#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.NavigatingCommaArgCS#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getNavigatingCommaArgCS()
 * @model
 * @generated
 */
public interface NavigatingCommaArgCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getNavigatingCommaArgCS_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.NavigatingCommaArgCS#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(NavigatingArgExpCS)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getNavigatingCommaArgCS_Name()
   * @model containment="true"
   * @generated
   */
  NavigatingArgExpCS getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.NavigatingCommaArgCS#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(NavigatingArgExpCS value);

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
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getNavigatingCommaArgCS_OwnedType()
   * @model containment="true"
   * @generated
   */
  TypeExpCS getOwnedType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.NavigatingCommaArgCS#getOwnedType <em>Owned Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Type</em>' containment reference.
   * @see #getOwnedType()
   * @generated
   */
  void setOwnedType(TypeExpCS value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(ExpCS)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getNavigatingCommaArgCS_Init()
   * @model containment="true"
   * @generated
   */
  ExpCS getInit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.NavigatingCommaArgCS#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(ExpCS value);

} // NavigatingCommaArgCS
