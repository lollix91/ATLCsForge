/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myAtl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myAtl.BindingStat;
import org.xtext.example.mydsl.myAtl.ExpCS;
import org.xtext.example.mydsl.myAtl.MyAtlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myAtl.impl.BindingStatImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.impl.BindingStatImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.impl.BindingStatImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingStatImpl extends StatementImpl implements BindingStat
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected ExpCS source;

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
  protected BindingStatImpl()
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
    return MyAtlPackage.Literals.BINDING_STAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(ExpCS newSource, NotificationChain msgs)
  {
    ExpCS oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyAtlPackage.BINDING_STAT__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(ExpCS newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyAtlPackage.BINDING_STAT__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyAtlPackage.BINDING_STAT__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyAtlPackage.BINDING_STAT__SOURCE, newSource, newSource));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyAtlPackage.BINDING_STAT__PROPERTY_NAME, oldPropertyName, propertyName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyAtlPackage.BINDING_STAT__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyAtlPackage.BINDING_STAT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyAtlPackage.BINDING_STAT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyAtlPackage.BINDING_STAT__VALUE, newValue, newValue));
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
      case MyAtlPackage.BINDING_STAT__SOURCE:
        return basicSetSource(null, msgs);
      case MyAtlPackage.BINDING_STAT__VALUE:
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
      case MyAtlPackage.BINDING_STAT__SOURCE:
        return getSource();
      case MyAtlPackage.BINDING_STAT__PROPERTY_NAME:
        return getPropertyName();
      case MyAtlPackage.BINDING_STAT__VALUE:
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
      case MyAtlPackage.BINDING_STAT__SOURCE:
        setSource((ExpCS)newValue);
        return;
      case MyAtlPackage.BINDING_STAT__PROPERTY_NAME:
        setPropertyName((String)newValue);
        return;
      case MyAtlPackage.BINDING_STAT__VALUE:
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
      case MyAtlPackage.BINDING_STAT__SOURCE:
        setSource((ExpCS)null);
        return;
      case MyAtlPackage.BINDING_STAT__PROPERTY_NAME:
        setPropertyName(PROPERTY_NAME_EDEFAULT);
        return;
      case MyAtlPackage.BINDING_STAT__VALUE:
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
      case MyAtlPackage.BINDING_STAT__SOURCE:
        return source != null;
      case MyAtlPackage.BINDING_STAT__PROPERTY_NAME:
        return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
      case MyAtlPackage.BINDING_STAT__VALUE:
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

} //BindingStatImpl
