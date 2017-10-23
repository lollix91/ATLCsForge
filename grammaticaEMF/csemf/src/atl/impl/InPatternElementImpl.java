/**
 */
package atl.impl;

import atl.AtlPackage;
import atl.InPattern;
import atl.InPatternElement;
import atl.OutPatternElement;

import java.util.Collection;

import ocl.OclModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atl.impl.InPatternElementImpl#getMapsTo <em>Maps To</em>}</li>
 *   <li>{@link atl.impl.InPatternElementImpl#getInPattern <em>In Pattern</em>}</li>
 *   <li>{@link atl.impl.InPatternElementImpl#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InPatternElementImpl extends PatternElementImpl implements InPatternElement {
	/**
	 * The cached value of the '{@link #getMapsTo() <em>Maps To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapsTo()
	 * @generated
	 * @ordered
	 */
	protected OutPatternElement mapsTo;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<OclModel> models;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InPatternElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlPackage.Literals.IN_PATTERN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPatternElement getMapsTo() {
		if (mapsTo != null && mapsTo.eIsProxy()) {
			InternalEObject oldMapsTo = (InternalEObject)mapsTo;
			mapsTo = (OutPatternElement)eResolveProxy(oldMapsTo);
			if (mapsTo != oldMapsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO, oldMapsTo, mapsTo));
			}
		}
		return mapsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPatternElement basicGetMapsTo() {
		return mapsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapsTo(OutPatternElement newMapsTo, NotificationChain msgs) {
		OutPatternElement oldMapsTo = mapsTo;
		mapsTo = newMapsTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO, oldMapsTo, newMapsTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapsTo(OutPatternElement newMapsTo) {
		if (newMapsTo != mapsTo) {
			NotificationChain msgs = null;
			if (mapsTo != null)
				msgs = ((InternalEObject)mapsTo).eInverseRemove(this, AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT, OutPatternElement.class, msgs);
			if (newMapsTo != null)
				msgs = ((InternalEObject)newMapsTo).eInverseAdd(this, AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT, OutPatternElement.class, msgs);
			msgs = basicSetMapsTo(newMapsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO, newMapsTo, newMapsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPattern getInPattern() {
		if (eContainerFeatureID() != AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN) return null;
		return (InPattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInPattern(InPattern newInPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInPattern, AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPattern(InPattern newInPattern) {
		if (newInPattern != eInternalContainer() || (eContainerFeatureID() != AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN && newInPattern != null)) {
			if (EcoreUtil.isAncestor(this, newInPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInPattern != null)
				msgs = ((InternalEObject)newInPattern).eInverseAdd(this, AtlPackage.IN_PATTERN__ELEMENTS, InPattern.class, msgs);
			msgs = basicSetInPattern(newInPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN, newInPattern, newInPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OclModel> getModels() {
		if (models == null) {
			models = new EObjectResolvingEList<OclModel>(OclModel.class, this, AtlPackage.IN_PATTERN_ELEMENT__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO:
				if (mapsTo != null)
					msgs = ((InternalEObject)mapsTo).eInverseRemove(this, AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT, OutPatternElement.class, msgs);
				return basicSetMapsTo((OutPatternElement)otherEnd, msgs);
			case AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInPattern((InPattern)otherEnd, msgs);
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
			case AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO:
				return basicSetMapsTo(null, msgs);
			case AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN:
				return basicSetInPattern(null, msgs);
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
			case AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN:
				return eInternalContainer().eInverseRemove(this, AtlPackage.IN_PATTERN__ELEMENTS, InPattern.class, msgs);
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
			case AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO:
				if (resolve) return getMapsTo();
				return basicGetMapsTo();
			case AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN:
				return getInPattern();
			case AtlPackage.IN_PATTERN_ELEMENT__MODELS:
				return getModels();
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
			case AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO:
				setMapsTo((OutPatternElement)newValue);
				return;
			case AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN:
				setInPattern((InPattern)newValue);
				return;
			case AtlPackage.IN_PATTERN_ELEMENT__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends OclModel>)newValue);
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
			case AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO:
				setMapsTo((OutPatternElement)null);
				return;
			case AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN:
				setInPattern((InPattern)null);
				return;
			case AtlPackage.IN_PATTERN_ELEMENT__MODELS:
				getModels().clear();
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
			case AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO:
				return mapsTo != null;
			case AtlPackage.IN_PATTERN_ELEMENT__IN_PATTERN:
				return getInPattern() != null;
			case AtlPackage.IN_PATTERN_ELEMENT__MODELS:
				return models != null && !models.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InPatternElementImpl
