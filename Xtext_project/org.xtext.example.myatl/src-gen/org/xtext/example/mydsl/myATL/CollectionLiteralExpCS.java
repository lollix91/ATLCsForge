/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myATL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myATL.CollectionLiteralExpCS#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.CollectionLiteralExpCS#getOwnedParts <em>Owned Parts</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.CollectionLiteralExpCS#getBacktrack <em>Backtrack</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCollectionLiteralExpCS()
 * @model
 * @generated
 */
public interface CollectionLiteralExpCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Type</em>' containment reference.
   * @see #setOwnedType(CollectionTypeCS)
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCollectionLiteralExpCS_OwnedType()
   * @model containment="true"
   * @generated
   */
  CollectionTypeCS getOwnedType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myATL.CollectionLiteralExpCS#getOwnedType <em>Owned Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Type</em>' containment reference.
   * @see #getOwnedType()
   * @generated
   */
  void setOwnedType(CollectionTypeCS value);

  /**
   * Returns the value of the '<em><b>Owned Parts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myATL.CollectionLiteralPartCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Parts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parts</em>' containment reference list.
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCollectionLiteralExpCS_OwnedParts()
   * @model containment="true"
   * @generated
   */
  EList<CollectionLiteralPartCS> getOwnedParts();

  /**
   * Returns the value of the '<em><b>Backtrack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Backtrack</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Backtrack</em>' attribute.
   * @see #setBacktrack(String)
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCollectionLiteralExpCS_Backtrack()
   * @model
   * @generated
   */
  String getBacktrack();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myATL.CollectionLiteralExpCS#getBacktrack <em>Backtrack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Backtrack</em>' attribute.
   * @see #getBacktrack()
   * @generated
   */
  void setBacktrack(String value);

} // CollectionLiteralExpCS