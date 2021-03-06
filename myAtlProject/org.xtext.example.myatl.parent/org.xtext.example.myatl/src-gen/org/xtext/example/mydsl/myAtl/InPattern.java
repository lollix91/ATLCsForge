/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myAtl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myAtl.InPattern#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.InPattern#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getInPattern()
 * @model
 * @generated
 */
public interface InPattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myAtl.InPatternElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getInPattern_Elements()
   * @model containment="true"
   * @generated
   */
  EList<InPatternElement> getElements();

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(ExpCS)
   * @see org.xtext.example.mydsl.myAtl.MyAtlPackage#getInPattern_Filter()
   * @model containment="true"
   * @generated
   */
  ExpCS getFilter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myAtl.InPattern#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(ExpCS value);

} // InPattern
