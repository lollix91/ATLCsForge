/**
 */
package atl.impl;

import atl.AtlPackage;
import atl.DropPattern;
import atl.OutPattern;
import atl.OutPatternElement;
import atl.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atl.impl.OutPatternImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link atl.impl.OutPatternImpl#getDropPattern <em>Drop Pattern</em>}</li>
 *   <li>{@link atl.impl.OutPatternImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutPatternImpl extends LocatedElementImpl implements OutPattern {
	/**
	 * The cached value of the '{@link #getDropPattern() <em>Drop Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropPattern()
	 * @generated
	 * @ordered
	 */
	protected DropPattern dropPattern;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<OutPatternElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlPackage.Literals.OUT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID() != AtlPackage.OUT_PATTERN__RULE) return null;
		return (Rule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, AtlPackage.OUT_PATTERN__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID() != AtlPackage.OUT_PATTERN__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, AtlPackage.RULE__OUT_PATTERN, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlPackage.OUT_PATTERN__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropPattern getDropPattern() {
		return dropPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropPattern(DropPattern newDropPattern, NotificationChain msgs) {
		DropPattern oldDropPattern = dropPattern;
		dropPattern = newDropPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtlPackage.OUT_PATTERN__DROP_PATTERN, oldDropPattern, newDropPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropPattern(DropPattern newDropPattern) {
		if (newDropPattern != dropPattern) {
			NotificationChain msgs = null;
			if (dropPattern != null)
				msgs = ((InternalEObject)dropPattern).eInverseRemove(this, AtlPackage.DROP_PATTERN__OUT_PATTERN, DropPattern.class, msgs);
			if (newDropPattern != null)
				msgs = ((InternalEObject)newDropPattern).eInverseAdd(this, AtlPackage.DROP_PATTERN__OUT_PATTERN, DropPattern.class, msgs);
			msgs = basicSetDropPattern(newDropPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlPackage.OUT_PATTERN__DROP_PATTERN, newDropPattern, newDropPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutPatternElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<OutPatternElement>(OutPatternElement.class, this, AtlPackage.OUT_PATTERN__ELEMENTS, AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtlPackage.OUT_PATTERN__RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRule((Rule)otherEnd, msgs);
			case AtlPackage.OUT_PATTERN__DROP_PATTERN:
				if (dropPattern != null)
					msgs = ((InternalEObject)dropPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtlPackage.OUT_PATTERN__DROP_PATTERN, null, msgs);
				return basicSetDropPattern((DropPattern)otherEnd, msgs);
			case AtlPackage.OUT_PATTERN__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
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
			case AtlPackage.OUT_PATTERN__RULE:
				return basicSetRule(null, msgs);
			case AtlPackage.OUT_PATTERN__DROP_PATTERN:
				return basicSetDropPattern(null, msgs);
			case AtlPackage.OUT_PATTERN__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case AtlPackage.OUT_PATTERN__RULE:
				return eInternalContainer().eInverseRemove(this, AtlPackage.RULE__OUT_PATTERN, Rule.class, msgs);
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
			case AtlPackage.OUT_PATTERN__RULE:
				return getRule();
			case AtlPackage.OUT_PATTERN__DROP_PATTERN:
				return getDropPattern();
			case AtlPackage.OUT_PATTERN__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AtlPackage.OUT_PATTERN__RULE:
				setRule((Rule)newValue);
				return;
			case AtlPackage.OUT_PATTERN__DROP_PATTERN:
				setDropPattern((DropPattern)newValue);
				return;
			case AtlPackage.OUT_PATTERN__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends OutPatternElement>)newValue);
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
			case AtlPackage.OUT_PATTERN__RULE:
				setRule((Rule)null);
				return;
			case AtlPackage.OUT_PATTERN__DROP_PATTERN:
				setDropPattern((DropPattern)null);
				return;
			case AtlPackage.OUT_PATTERN__ELEMENTS:
				getElements().clear();
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
			case AtlPackage.OUT_PATTERN__RULE:
				return getRule() != null;
			case AtlPackage.OUT_PATTERN__DROP_PATTERN:
				return dropPattern != null;
			case AtlPackage.OUT_PATTERN__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutPatternImpl
