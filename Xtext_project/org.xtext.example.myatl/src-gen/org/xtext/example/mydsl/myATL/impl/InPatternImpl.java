/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myATL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myATL.ExpCS;
import org.xtext.example.mydsl.myATL.InPattern;
import org.xtext.example.mydsl.myATL.InPatternElement;
import org.xtext.example.mydsl.myATL.MyATLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myATL.impl.InPatternImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.impl.InPatternImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InPatternImpl extends MinimalEObjectImpl.Container implements InPattern
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<InPatternElement> elements;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected ExpCS filter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InPatternImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyATLPackage.Literals.IN_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InPatternElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<InPatternElement>(InPatternElement.class, this, MyATLPackage.IN_PATTERN__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(ExpCS newFilter, NotificationChain msgs)
  {
    ExpCS oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyATLPackage.IN_PATTERN__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(ExpCS newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyATLPackage.IN_PATTERN__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyATLPackage.IN_PATTERN__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyATLPackage.IN_PATTERN__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyATLPackage.IN_PATTERN__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case MyATLPackage.IN_PATTERN__FILTER:
        return basicSetFilter(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyATLPackage.IN_PATTERN__ELEMENTS:
        return getElements();
      case MyATLPackage.IN_PATTERN__FILTER:
        return getFilter();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyATLPackage.IN_PATTERN__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends InPatternElement>)newValue);
        return;
      case MyATLPackage.IN_PATTERN__FILTER:
        setFilter((ExpCS)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyATLPackage.IN_PATTERN__ELEMENTS:
        getElements().clear();
        return;
      case MyATLPackage.IN_PATTERN__FILTER:
        setFilter((ExpCS)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyATLPackage.IN_PATTERN__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case MyATLPackage.IN_PATTERN__FILTER:
        return filter != null;
    }
    return super.eIsSet(featureID);
  }

} //InPatternImpl
