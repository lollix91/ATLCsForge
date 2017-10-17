/**
 */
package atl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atl.Rule#getOutPattern <em>Out Pattern</em>}</li>
 *   <li>{@link atl.Rule#getActionBlock <em>Action Block</em>}</li>
 *   <li>{@link atl.Rule#getVariables <em>Variables</em>}</li>
 *   <li>{@link atl.Rule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see atl.AtlPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends ModuleElement {
	/**
	 * Returns the value of the '<em><b>Out Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link atl.OutPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Pattern</em>' containment reference.
	 * @see #setOutPattern(OutPattern)
	 * @see atl.AtlPackage#getRule_OutPattern()
	 * @see atl.OutPattern#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	OutPattern getOutPattern();

	/**
	 * Sets the value of the '{@link atl.Rule#getOutPattern <em>Out Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Pattern</em>' containment reference.
	 * @see #getOutPattern()
	 * @generated
	 */
	void setOutPattern(OutPattern value);

	/**
	 * Returns the value of the '<em><b>Action Block</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link atl.ActionBlock#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Block</em>' containment reference.
	 * @see #setActionBlock(ActionBlock)
	 * @see atl.AtlPackage#getRule_ActionBlock()
	 * @see atl.ActionBlock#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	ActionBlock getActionBlock();

	/**
	 * Sets the value of the '{@link atl.Rule#getActionBlock <em>Action Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Block</em>' containment reference.
	 * @see #getActionBlock()
	 * @generated
	 */
	void setActionBlock(ActionBlock value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link atl.RuleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link atl.RuleVariableDeclaration#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see atl.AtlPackage#getRule_Variables()
	 * @see atl.RuleVariableDeclaration#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	EList<RuleVariableDeclaration> getVariables();

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
	 * @see atl.AtlPackage#getRule_Name()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link atl.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Rule
