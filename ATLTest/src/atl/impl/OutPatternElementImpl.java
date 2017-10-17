/**
 */
package atl.impl;

import atl.AtlPackage;
import atl.Binding;
import atl.InPatternElement;
import atl.OutPattern;
import atl.OutPatternElement;

import java.util.Collection;

import ocl.OclModel;

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
 * An implementation of the model object '<em><b>Out Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atl.impl.OutPatternElementImpl#getOutPattern <em>Out Pattern</em>}</li>
 *   <li>{@link atl.impl.OutPatternElementImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link atl.impl.OutPatternElementImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link atl.impl.OutPatternElementImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OutPatternElementImpl extends PatternElementImpl implements OutPatternElement {
	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected InPatternElement sourceElement;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected OclModel model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPatternElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlPackage.Literals.OUT_PATTERN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPattern getOutPattern() {
		if (eContainerFeatureID() != AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN) return null;
		return (OutPattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutPattern(OutPattern newOutPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOutPattern, AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutPattern(OutPattern newOutPattern) {
		if (newOutPattern != eInternalContainer() || (eContainerFeatureID() != AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN && newOutPattern != null)) {
			if (EcoreUtil.isAncestor(this, newOutPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOutPattern != null)
				msgs = ((InternalEObject)newOutPattern).eInverseAdd(this, AtlPackage.OUT_PATTERN__ELEMENTS, OutPattern.class, msgs);
			msgs = basicSetOutPattern(newOutPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN, newOutPattern, newOutPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPatternElement getSourceElement() {
		if (sourceElement != null && sourceElement.eIsProxy()) {
			InternalEObject oldSourceElement = (InternalEObject)sourceElement;
			sourceElement = (InPatternElement)eResolveProxy(oldSourceElement);
			if (sourceElement != oldSourceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT, oldSourceElement, sourceElement));
			}
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPatternElement basicGetSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceElement(InPatternElement newSourceElement, NotificationChain msgs) {
		InPatternElement oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT, oldSourceElement, newSourceElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(InPatternElement newSourceElement) {
		if (newSourceElement != sourceElement) {
			NotificationChain msgs = null;
			if (sourceElement != null)
				msgs = ((InternalEObject)sourceElement).eInverseRemove(this, AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO, InPatternElement.class, msgs);
			if (newSourceElement != null)
				msgs = ((InternalEObject)newSourceElement).eInverseAdd(this, AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO, InPatternElement.class, msgs);
			msgs = basicSetSourceElement(newSourceElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT, newSourceElement, newSourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<Binding>(Binding.class, this, AtlPackage.OUT_PATTERN_ELEMENT__BINDINGS, AtlPackage.BINDING__OUT_PATTERN_ELEMENT);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclModel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (OclModel)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlPackage.OUT_PATTERN_ELEMENT__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclModel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(OclModel newModel) {
		OclModel oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlPackage.OUT_PATTERN_ELEMENT__MODEL, oldModel, model));
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
			case AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOutPattern((OutPattern)otherEnd, msgs);
			case AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT:
				if (sourceElement != null)
					msgs = ((InternalEObject)sourceElement).eInverseRemove(this, AtlPackage.IN_PATTERN_ELEMENT__MAPS_TO, InPatternElement.class, msgs);
				return basicSetSourceElement((InPatternElement)otherEnd, msgs);
			case AtlPackage.OUT_PATTERN_ELEMENT__BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindings()).basicAdd(otherEnd, msgs);
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
			case AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN:
				return basicSetOutPattern(null, msgs);
			case AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT:
				return basicSetSourceElement(null, msgs);
			case AtlPackage.OUT_PATTERN_ELEMENT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN:
				return eInternalContainer().eInverseRemove(this, AtlPackage.OUT_PATTERN__ELEMENTS, OutPattern.class, msgs);
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
			case AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN:
				return getOutPattern();
			case AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT:
				if (resolve) return getSourceElement();
				return basicGetSourceElement();
			case AtlPackage.OUT_PATTERN_ELEMENT__BINDINGS:
				return getBindings();
			case AtlPackage.OUT_PATTERN_ELEMENT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN:
				setOutPattern((OutPattern)newValue);
				return;
			case AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT:
				setSourceElement((InPatternElement)newValue);
				return;
			case AtlPackage.OUT_PATTERN_ELEMENT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case AtlPackage.OUT_PATTERN_ELEMENT__MODEL:
				setModel((OclModel)newValue);
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
			case AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN:
				setOutPattern((OutPattern)null);
				return;
			case AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT:
				setSourceElement((InPatternElement)null);
				return;
			case AtlPackage.OUT_PATTERN_ELEMENT__BINDINGS:
				getBindings().clear();
				return;
			case AtlPackage.OUT_PATTERN_ELEMENT__MODEL:
				setModel((OclModel)null);
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
			case AtlPackage.OUT_PATTERN_ELEMENT__OUT_PATTERN:
				return getOutPattern() != null;
			case AtlPackage.OUT_PATTERN_ELEMENT__SOURCE_ELEMENT:
				return sourceElement != null;
			case AtlPackage.OUT_PATTERN_ELEMENT__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case AtlPackage.OUT_PATTERN_ELEMENT__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

} //OutPatternElementImpl
