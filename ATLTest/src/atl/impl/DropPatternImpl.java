/**
 */
package atl.impl;

import atl.AtlPackage;
import atl.DropPattern;
import atl.OutPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atl.impl.DropPatternImpl#getOutPattern <em>Out Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropPatternImpl extends LocatedElementImpl implements DropPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlPackage.Literals.DROP_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPattern getOutPattern() {
		if (eContainerFeatureID() != AtlPackage.DROP_PATTERN__OUT_PATTERN) return null;
		return (OutPattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutPattern(OutPattern newOutPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOutPattern, AtlPackage.DROP_PATTERN__OUT_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutPattern(OutPattern newOutPattern) {
		if (newOutPattern != eInternalContainer() || (eContainerFeatureID() != AtlPackage.DROP_PATTERN__OUT_PATTERN && newOutPattern != null)) {
			if (EcoreUtil.isAncestor(this, newOutPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOutPattern != null)
				msgs = ((InternalEObject)newOutPattern).eInverseAdd(this, AtlPackage.OUT_PATTERN__DROP_PATTERN, OutPattern.class, msgs);
			msgs = basicSetOutPattern(newOutPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlPackage.DROP_PATTERN__OUT_PATTERN, newOutPattern, newOutPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtlPackage.DROP_PATTERN__OUT_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOutPattern((OutPattern)otherEnd, msgs);
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
			case AtlPackage.DROP_PATTERN__OUT_PATTERN:
				return basicSetOutPattern(null, msgs);
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
			case AtlPackage.DROP_PATTERN__OUT_PATTERN:
				return eInternalContainer().eInverseRemove(this, AtlPackage.OUT_PATTERN__DROP_PATTERN, OutPattern.class, msgs);
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
			case AtlPackage.DROP_PATTERN__OUT_PATTERN:
				return getOutPattern();
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
			case AtlPackage.DROP_PATTERN__OUT_PATTERN:
				setOutPattern((OutPattern)newValue);
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
			case AtlPackage.DROP_PATTERN__OUT_PATTERN:
				setOutPattern((OutPattern)null);
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
			case AtlPackage.DROP_PATTERN__OUT_PATTERN:
				return getOutPattern() != null;
		}
		return super.eIsSet(featureID);
	}

} //DropPatternImpl
