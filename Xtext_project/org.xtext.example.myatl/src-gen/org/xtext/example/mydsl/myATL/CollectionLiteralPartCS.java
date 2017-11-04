/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myATL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal Part CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myATL.CollectionLiteralPartCS#getExpressionCS <em>Expression CS</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.CollectionLiteralPartCS#getLastExpressionCS <em>Last Expression CS</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.CollectionLiteralPartCS#getBacktrack <em>Backtrack</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCollectionLiteralPartCS()
 * @model
 * @generated
 */
public interface CollectionLiteralPartCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression CS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression CS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression CS</em>' containment reference.
   * @see #setExpressionCS(ExpCS)
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCollectionLiteralPartCS_ExpressionCS()
   * @model containment="true"
   * @generated
   */
  ExpCS getExpressionCS();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myATL.CollectionLiteralPartCS#getExpressionCS <em>Expression CS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression CS</em>' containment reference.
   * @see #getExpressionCS()
   * @generated
   */
  void setExpressionCS(ExpCS value);

  /**
   * Returns the value of the '<em><b>Last Expression CS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Expression CS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Expression CS</em>' containment reference.
   * @see #setLastExpressionCS(ExpCS)
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCollectionLiteralPartCS_LastExpressionCS()
   * @model containment="true"
   * @generated
   */
  ExpCS getLastExpressionCS();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myATL.CollectionLiteralPartCS#getLastExpressionCS <em>Last Expression CS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Expression CS</em>' containment reference.
   * @see #getLastExpressionCS()
   * @generated
   */
  void setLastExpressionCS(ExpCS value);

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
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCollectionLiteralPartCS_Backtrack()
   * @model
   * @generated
   */
  String getBacktrack();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myATL.CollectionLiteralPartCS#getBacktrack <em>Backtrack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Backtrack</em>' attribute.
   * @see #getBacktrack()
   * @generated
   */
  void setBacktrack(String value);

} // CollectionLiteralPartCS
