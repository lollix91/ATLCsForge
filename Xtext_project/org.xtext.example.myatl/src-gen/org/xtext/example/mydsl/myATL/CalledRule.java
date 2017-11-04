/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myATL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Called Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myATL.CalledRule#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.CalledRule#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.CalledRule#getOutPattern <em>Out Pattern</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.CalledRule#getActionBlock <em>Action Block</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCalledRule()
 * @model
 * @generated
 */
public interface CalledRule extends ModuleElement
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
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCalledRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myATL.CalledRule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myATL.RuleVariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCalledRule_Variables()
   * @model containment="true"
   * @generated
   */
  EList<RuleVariableDeclaration> getVariables();

  /**
   * Returns the value of the '<em><b>Out Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Pattern</em>' containment reference.
   * @see #setOutPattern(OutPattern)
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCalledRule_OutPattern()
   * @model containment="true"
   * @generated
   */
  OutPattern getOutPattern();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myATL.CalledRule#getOutPattern <em>Out Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Pattern</em>' containment reference.
   * @see #getOutPattern()
   * @generated
   */
  void setOutPattern(OutPattern value);

  /**
   * Returns the value of the '<em><b>Action Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Block</em>' containment reference.
   * @see #setActionBlock(ActionBlock)
   * @see org.xtext.example.mydsl.myATL.MyATLPackage#getCalledRule_ActionBlock()
   * @model containment="true"
   * @generated
   */
  ActionBlock getActionBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myATL.CalledRule#getActionBlock <em>Action Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Block</em>' containment reference.
   * @see #getActionBlock()
   * @generated
   */
  void setActionBlock(ActionBlock value);

} // CalledRule
