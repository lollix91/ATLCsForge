/**
 */
package ocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.CollectionExp#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see ocl.OclPackage#getCollectionExp()
 * @model abstract="true"
 * @generated
 */
public interface CollectionExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ocl.OclExpression}.
	 * It is bidirectional and its opposite is '{@link ocl.OclExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ocl.OclPackage#getCollectionExp_Elements()
	 * @see ocl.OclExpression#getCollection
	 * @model opposite="collection" containment="true"
	 * @generated
	 */
	EList<OclExpression> getElements();

} // CollectionExp
