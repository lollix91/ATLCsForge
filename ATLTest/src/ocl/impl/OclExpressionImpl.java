/**
 */
package ocl.impl;

import atl.impl.LocatedElementImpl;

import ocl.Attribute;
import ocl.CollectionExp;
import ocl.IfExp;
import ocl.LetExp;
import ocl.LoopExp;
import ocl.OclExpression;
import ocl.OclPackage;
import ocl.OclType;
import ocl.Operation;
import ocl.OperationCallExp;
import ocl.PropertyCallExp;
import ocl.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ocl.impl.OclExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getIfExp3 <em>If Exp3</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getAppliedProperty <em>Applied Property</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getLoopExp <em>Loop Exp</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getParentOperation <em>Parent Operation</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getInitializedVariable <em>Initialized Variable</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getIfExp2 <em>If Exp2</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getOwningOperation <em>Owning Operation</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getIfExp1 <em>If Exp1</em>}</li>
 *   <li>{@link ocl.impl.OclExpressionImpl#getOwningAttribute <em>Owning Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OclExpressionImpl extends LocatedElementImpl implements OclExpression {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OclType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OclPackage.Literals.OCL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(OclType newType, NotificationChain msgs) {
		OclType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OclType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, OclPackage.OCL_TYPE__OCL_EXPRESSION, OclType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, OclPackage.OCL_TYPE__OCL_EXPRESSION, OclType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp getIfExp3() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__IF_EXP3) return null;
		return (IfExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExp3(IfExp newIfExp3, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIfExp3, OclPackage.OCL_EXPRESSION__IF_EXP3, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExp3(IfExp newIfExp3) {
		if (newIfExp3 != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__IF_EXP3 && newIfExp3 != null)) {
			if (EcoreUtil.isAncestor(this, newIfExp3))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIfExp3 != null)
				msgs = ((InternalEObject)newIfExp3).eInverseAdd(this, OclPackage.IF_EXP__ELSE_EXPRESSION, IfExp.class, msgs);
			msgs = basicSetIfExp3(newIfExp3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__IF_EXP3, newIfExp3, newIfExp3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExp getAppliedProperty() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY) return null;
		return (PropertyCallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedProperty(PropertyCallExp newAppliedProperty, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAppliedProperty, OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedProperty(PropertyCallExp newAppliedProperty) {
		if (newAppliedProperty != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY && newAppliedProperty != null)) {
			if (EcoreUtil.isAncestor(this, newAppliedProperty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAppliedProperty != null)
				msgs = ((InternalEObject)newAppliedProperty).eInverseAdd(this, OclPackage.PROPERTY_CALL_EXP__SOURCE, PropertyCallExp.class, msgs);
			msgs = basicSetAppliedProperty(newAppliedProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY, newAppliedProperty, newAppliedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionExp getCollection() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__COLLECTION) return null;
		return (CollectionExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(CollectionExp newCollection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCollection, OclPackage.OCL_EXPRESSION__COLLECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(CollectionExp newCollection) {
		if (newCollection != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__COLLECTION && newCollection != null)) {
			if (EcoreUtil.isAncestor(this, newCollection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, OclPackage.COLLECTION_EXP__ELEMENTS, CollectionExp.class, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExp getLetExp() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__LET_EXP) return null;
		return (LetExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLetExp(LetExp newLetExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLetExp, OclPackage.OCL_EXPRESSION__LET_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetExp(LetExp newLetExp) {
		if (newLetExp != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__LET_EXP && newLetExp != null)) {
			if (EcoreUtil.isAncestor(this, newLetExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLetExp != null)
				msgs = ((InternalEObject)newLetExp).eInverseAdd(this, OclPackage.LET_EXP__IN_, LetExp.class, msgs);
			msgs = basicSetLetExp(newLetExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__LET_EXP, newLetExp, newLetExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopExp getLoopExp() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__LOOP_EXP) return null;
		return (LoopExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopExp(LoopExp newLoopExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLoopExp, OclPackage.OCL_EXPRESSION__LOOP_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopExp(LoopExp newLoopExp) {
		if (newLoopExp != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__LOOP_EXP && newLoopExp != null)) {
			if (EcoreUtil.isAncestor(this, newLoopExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLoopExp != null)
				msgs = ((InternalEObject)newLoopExp).eInverseAdd(this, OclPackage.LOOP_EXP__BODY, LoopExp.class, msgs);
			msgs = basicSetLoopExp(newLoopExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__LOOP_EXP, newLoopExp, newLoopExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallExp getParentOperation() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__PARENT_OPERATION) return null;
		return (OperationCallExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentOperation(OperationCallExp newParentOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentOperation, OclPackage.OCL_EXPRESSION__PARENT_OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentOperation(OperationCallExp newParentOperation) {
		if (newParentOperation != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__PARENT_OPERATION && newParentOperation != null)) {
			if (EcoreUtil.isAncestor(this, newParentOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentOperation != null)
				msgs = ((InternalEObject)newParentOperation).eInverseAdd(this, OclPackage.OPERATION_CALL_EXP__ARGUMENTS, OperationCallExp.class, msgs);
			msgs = basicSetParentOperation(newParentOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__PARENT_OPERATION, newParentOperation, newParentOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getInitializedVariable() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE) return null;
		return (VariableDeclaration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializedVariable(VariableDeclaration newInitializedVariable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInitializedVariable, OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializedVariable(VariableDeclaration newInitializedVariable) {
		if (newInitializedVariable != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE && newInitializedVariable != null)) {
			if (EcoreUtil.isAncestor(this, newInitializedVariable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInitializedVariable != null)
				msgs = ((InternalEObject)newInitializedVariable).eInverseAdd(this, OclPackage.VARIABLE_DECLARATION__INIT_EXPRESSION, VariableDeclaration.class, msgs);
			msgs = basicSetInitializedVariable(newInitializedVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE, newInitializedVariable, newInitializedVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp getIfExp2() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__IF_EXP2) return null;
		return (IfExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExp2(IfExp newIfExp2, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIfExp2, OclPackage.OCL_EXPRESSION__IF_EXP2, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExp2(IfExp newIfExp2) {
		if (newIfExp2 != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__IF_EXP2 && newIfExp2 != null)) {
			if (EcoreUtil.isAncestor(this, newIfExp2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIfExp2 != null)
				msgs = ((InternalEObject)newIfExp2).eInverseAdd(this, OclPackage.IF_EXP__THEN_EXPRESSION, IfExp.class, msgs);
			msgs = basicSetIfExp2(newIfExp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__IF_EXP2, newIfExp2, newIfExp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwningOperation() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__OWNING_OPERATION) return null;
		return (Operation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningOperation(Operation newOwningOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningOperation, OclPackage.OCL_EXPRESSION__OWNING_OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningOperation(Operation newOwningOperation) {
		if (newOwningOperation != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__OWNING_OPERATION && newOwningOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOwningOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningOperation != null)
				msgs = ((InternalEObject)newOwningOperation).eInverseAdd(this, OclPackage.OPERATION__BODY, Operation.class, msgs);
			msgs = basicSetOwningOperation(newOwningOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__OWNING_OPERATION, newOwningOperation, newOwningOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp getIfExp1() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__IF_EXP1) return null;
		return (IfExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExp1(IfExp newIfExp1, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIfExp1, OclPackage.OCL_EXPRESSION__IF_EXP1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExp1(IfExp newIfExp1) {
		if (newIfExp1 != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__IF_EXP1 && newIfExp1 != null)) {
			if (EcoreUtil.isAncestor(this, newIfExp1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIfExp1 != null)
				msgs = ((InternalEObject)newIfExp1).eInverseAdd(this, OclPackage.IF_EXP__CONDITION, IfExp.class, msgs);
			msgs = basicSetIfExp1(newIfExp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__IF_EXP1, newIfExp1, newIfExp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getOwningAttribute() {
		if (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE) return null;
		return (Attribute)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningAttribute(Attribute newOwningAttribute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningAttribute, OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAttribute(Attribute newOwningAttribute) {
		if (newOwningAttribute != eInternalContainer() || (eContainerFeatureID() != OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE && newOwningAttribute != null)) {
			if (EcoreUtil.isAncestor(this, newOwningAttribute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningAttribute != null)
				msgs = ((InternalEObject)newOwningAttribute).eInverseAdd(this, OclPackage.ATTRIBUTE__INIT_EXPRESSION, Attribute.class, msgs);
			msgs = basicSetOwningAttribute(newOwningAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE, newOwningAttribute, newOwningAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OclPackage.OCL_EXPRESSION__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OclPackage.OCL_EXPRESSION__TYPE, null, msgs);
				return basicSetType((OclType)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__IF_EXP3:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIfExp3((IfExp)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAppliedProperty((PropertyCallExp)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__COLLECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCollection((CollectionExp)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__LET_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLetExp((LetExp)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__LOOP_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLoopExp((LoopExp)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__PARENT_OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentOperation((OperationCallExp)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInitializedVariable((VariableDeclaration)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__IF_EXP2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIfExp2((IfExp)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__OWNING_OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningOperation((Operation)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__IF_EXP1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIfExp1((IfExp)otherEnd, msgs);
			case OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningAttribute((Attribute)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OclPackage.OCL_EXPRESSION__TYPE:
				return basicSetType(null, msgs);
			case OclPackage.OCL_EXPRESSION__IF_EXP3:
				return basicSetIfExp3(null, msgs);
			case OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				return basicSetAppliedProperty(null, msgs);
			case OclPackage.OCL_EXPRESSION__COLLECTION:
				return basicSetCollection(null, msgs);
			case OclPackage.OCL_EXPRESSION__LET_EXP:
				return basicSetLetExp(null, msgs);
			case OclPackage.OCL_EXPRESSION__LOOP_EXP:
				return basicSetLoopExp(null, msgs);
			case OclPackage.OCL_EXPRESSION__PARENT_OPERATION:
				return basicSetParentOperation(null, msgs);
			case OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				return basicSetInitializedVariable(null, msgs);
			case OclPackage.OCL_EXPRESSION__IF_EXP2:
				return basicSetIfExp2(null, msgs);
			case OclPackage.OCL_EXPRESSION__OWNING_OPERATION:
				return basicSetOwningOperation(null, msgs);
			case OclPackage.OCL_EXPRESSION__IF_EXP1:
				return basicSetIfExp1(null, msgs);
			case OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				return basicSetOwningAttribute(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OclPackage.OCL_EXPRESSION__IF_EXP3:
				return eInternalContainer().eInverseRemove(this, OclPackage.IF_EXP__ELSE_EXPRESSION, IfExp.class, msgs);
			case OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				return eInternalContainer().eInverseRemove(this, OclPackage.PROPERTY_CALL_EXP__SOURCE, PropertyCallExp.class, msgs);
			case OclPackage.OCL_EXPRESSION__COLLECTION:
				return eInternalContainer().eInverseRemove(this, OclPackage.COLLECTION_EXP__ELEMENTS, CollectionExp.class, msgs);
			case OclPackage.OCL_EXPRESSION__LET_EXP:
				return eInternalContainer().eInverseRemove(this, OclPackage.LET_EXP__IN_, LetExp.class, msgs);
			case OclPackage.OCL_EXPRESSION__LOOP_EXP:
				return eInternalContainer().eInverseRemove(this, OclPackage.LOOP_EXP__BODY, LoopExp.class, msgs);
			case OclPackage.OCL_EXPRESSION__PARENT_OPERATION:
				return eInternalContainer().eInverseRemove(this, OclPackage.OPERATION_CALL_EXP__ARGUMENTS, OperationCallExp.class, msgs);
			case OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				return eInternalContainer().eInverseRemove(this, OclPackage.VARIABLE_DECLARATION__INIT_EXPRESSION, VariableDeclaration.class, msgs);
			case OclPackage.OCL_EXPRESSION__IF_EXP2:
				return eInternalContainer().eInverseRemove(this, OclPackage.IF_EXP__THEN_EXPRESSION, IfExp.class, msgs);
			case OclPackage.OCL_EXPRESSION__OWNING_OPERATION:
				return eInternalContainer().eInverseRemove(this, OclPackage.OPERATION__BODY, Operation.class, msgs);
			case OclPackage.OCL_EXPRESSION__IF_EXP1:
				return eInternalContainer().eInverseRemove(this, OclPackage.IF_EXP__CONDITION, IfExp.class, msgs);
			case OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, OclPackage.ATTRIBUTE__INIT_EXPRESSION, Attribute.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OclPackage.OCL_EXPRESSION__TYPE:
				return getType();
			case OclPackage.OCL_EXPRESSION__IF_EXP3:
				return getIfExp3();
			case OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				return getAppliedProperty();
			case OclPackage.OCL_EXPRESSION__COLLECTION:
				return getCollection();
			case OclPackage.OCL_EXPRESSION__LET_EXP:
				return getLetExp();
			case OclPackage.OCL_EXPRESSION__LOOP_EXP:
				return getLoopExp();
			case OclPackage.OCL_EXPRESSION__PARENT_OPERATION:
				return getParentOperation();
			case OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				return getInitializedVariable();
			case OclPackage.OCL_EXPRESSION__IF_EXP2:
				return getIfExp2();
			case OclPackage.OCL_EXPRESSION__OWNING_OPERATION:
				return getOwningOperation();
			case OclPackage.OCL_EXPRESSION__IF_EXP1:
				return getIfExp1();
			case OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				return getOwningAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OclPackage.OCL_EXPRESSION__TYPE:
				setType((OclType)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__IF_EXP3:
				setIfExp3((IfExp)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				setAppliedProperty((PropertyCallExp)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__COLLECTION:
				setCollection((CollectionExp)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__LET_EXP:
				setLetExp((LetExp)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__LOOP_EXP:
				setLoopExp((LoopExp)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__PARENT_OPERATION:
				setParentOperation((OperationCallExp)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				setInitializedVariable((VariableDeclaration)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__IF_EXP2:
				setIfExp2((IfExp)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__OWNING_OPERATION:
				setOwningOperation((Operation)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__IF_EXP1:
				setIfExp1((IfExp)newValue);
				return;
			case OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				setOwningAttribute((Attribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OclPackage.OCL_EXPRESSION__TYPE:
				setType((OclType)null);
				return;
			case OclPackage.OCL_EXPRESSION__IF_EXP3:
				setIfExp3((IfExp)null);
				return;
			case OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				setAppliedProperty((PropertyCallExp)null);
				return;
			case OclPackage.OCL_EXPRESSION__COLLECTION:
				setCollection((CollectionExp)null);
				return;
			case OclPackage.OCL_EXPRESSION__LET_EXP:
				setLetExp((LetExp)null);
				return;
			case OclPackage.OCL_EXPRESSION__LOOP_EXP:
				setLoopExp((LoopExp)null);
				return;
			case OclPackage.OCL_EXPRESSION__PARENT_OPERATION:
				setParentOperation((OperationCallExp)null);
				return;
			case OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				setInitializedVariable((VariableDeclaration)null);
				return;
			case OclPackage.OCL_EXPRESSION__IF_EXP2:
				setIfExp2((IfExp)null);
				return;
			case OclPackage.OCL_EXPRESSION__OWNING_OPERATION:
				setOwningOperation((Operation)null);
				return;
			case OclPackage.OCL_EXPRESSION__IF_EXP1:
				setIfExp1((IfExp)null);
				return;
			case OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				setOwningAttribute((Attribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OclPackage.OCL_EXPRESSION__TYPE:
				return type != null;
			case OclPackage.OCL_EXPRESSION__IF_EXP3:
				return getIfExp3() != null;
			case OclPackage.OCL_EXPRESSION__APPLIED_PROPERTY:
				return getAppliedProperty() != null;
			case OclPackage.OCL_EXPRESSION__COLLECTION:
				return getCollection() != null;
			case OclPackage.OCL_EXPRESSION__LET_EXP:
				return getLetExp() != null;
			case OclPackage.OCL_EXPRESSION__LOOP_EXP:
				return getLoopExp() != null;
			case OclPackage.OCL_EXPRESSION__PARENT_OPERATION:
				return getParentOperation() != null;
			case OclPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE:
				return getInitializedVariable() != null;
			case OclPackage.OCL_EXPRESSION__IF_EXP2:
				return getIfExp2() != null;
			case OclPackage.OCL_EXPRESSION__OWNING_OPERATION:
				return getOwningOperation() != null;
			case OclPackage.OCL_EXPRESSION__IF_EXP1:
				return getIfExp1() != null;
			case OclPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE:
				return getOwningAttribute() != null;
		}
		return super.eIsSet(featureID);
	}

} //OclExpressionImpl
