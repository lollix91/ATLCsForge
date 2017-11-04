/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myATL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myATL.Binding;
import org.xtext.example.mydsl.myATL.ExpCS;
import org.xtext.example.mydsl.myATL.MyATLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myATL.impl.BindingImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.impl.BindingImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
  protected String propertyName = PROPERTY_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ExpCS value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return MyATLPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyName()
  {
    return propertyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyName(String newPropertyName)
  {
    String oldPropertyName = propertyName;
    propertyName = newPropertyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyATLPackage.BINDING__PROPERTY_NAME, oldPropertyName, propertyName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ExpCS newValue, NotificationChain msgs)
  {
    ExpCS oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyATLPackage.BINDING__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ExpCS newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyATLPackage.BINDING__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyATLPackage.BINDING__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyATLPackage.BINDING__VALUE, newValue, newValue));
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
      case MyATLPackage.BINDING__VALUE:
        return basicSetValue(null, msgs);
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
      case MyATLPackage.BINDING__PROPERTY_NAME:
        return getPropertyName();
      case MyATLPackage.BINDING__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyATLPackage.BINDING__PROPERTY_NAME:
        setPropertyName((String)newValue);
        return;
      case MyATLPackage.BINDING__VALUE:
        setValue((ExpCS)newValue);
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
      case MyATLPackage.BINDING__PROPERTY_NAME:
        setPropertyName(PROPERTY_NAME_EDEFAULT);
        return;
      case MyATLPackage.BINDING__VALUE:
        setValue((ExpCS)null);
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
      case MyATLPackage.BINDING__PROPERTY_NAME:
        return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
      case MyATLPackage.BINDING__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (propertyName: ");
    result.append(propertyName);
    result.append(')');
    return result.toString();
  }

} //BindingImpl
