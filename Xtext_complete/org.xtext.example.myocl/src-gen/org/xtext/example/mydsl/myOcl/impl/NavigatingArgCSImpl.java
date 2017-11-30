/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myOcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myOcl.ExpCS;
import org.xtext.example.mydsl.myOcl.MyOclPackage;
import org.xtext.example.mydsl.myOcl.NavigatingArgCS;
import org.xtext.example.mydsl.myOcl.NavigatingArgExpCS;
import org.xtext.example.mydsl.myOcl.TypeExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigating Arg CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myOcl.impl.NavigatingArgCSImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myOcl.impl.NavigatingArgCSImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myOcl.impl.NavigatingArgCSImpl#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigatingArgCSImpl extends MinimalEObjectImpl.Container implements NavigatingArgCS
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected NavigatingArgExpCS name;

  /**
   * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedType()
   * @generated
   * @ordered
   */
  protected TypeExpCS ownedType;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected ExpCS init;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NavigatingArgCSImpl()
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
    return MyOclPackage.Literals.NAVIGATING_ARG_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigatingArgExpCS getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(NavigatingArgExpCS newName, NotificationChain msgs)
  {
    NavigatingArgExpCS oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyOclPackage.NAVIGATING_ARG_CS__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(NavigatingArgExpCS newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyOclPackage.NAVIGATING_ARG_CS__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyOclPackage.NAVIGATING_ARG_CS__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyOclPackage.NAVIGATING_ARG_CS__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpCS getOwnedType()
  {
    return ownedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedType(TypeExpCS newOwnedType, NotificationChain msgs)
  {
    TypeExpCS oldOwnedType = ownedType;
    ownedType = newOwnedType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyOclPackage.NAVIGATING_ARG_CS__OWNED_TYPE, oldOwnedType, newOwnedType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedType(TypeExpCS newOwnedType)
  {
    if (newOwnedType != ownedType)
    {
      NotificationChain msgs = null;
      if (ownedType != null)
        msgs = ((InternalEObject)ownedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyOclPackage.NAVIGATING_ARG_CS__OWNED_TYPE, null, msgs);
      if (newOwnedType != null)
        msgs = ((InternalEObject)newOwnedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyOclPackage.NAVIGATING_ARG_CS__OWNED_TYPE, null, msgs);
      msgs = basicSetOwnedType(newOwnedType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyOclPackage.NAVIGATING_ARG_CS__OWNED_TYPE, newOwnedType, newOwnedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(ExpCS newInit, NotificationChain msgs)
  {
    ExpCS oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyOclPackage.NAVIGATING_ARG_CS__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(ExpCS newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyOclPackage.NAVIGATING_ARG_CS__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyOclPackage.NAVIGATING_ARG_CS__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyOclPackage.NAVIGATING_ARG_CS__INIT, newInit, newInit));
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
      case MyOclPackage.NAVIGATING_ARG_CS__NAME:
        return basicSetName(null, msgs);
      case MyOclPackage.NAVIGATING_ARG_CS__OWNED_TYPE:
        return basicSetOwnedType(null, msgs);
      case MyOclPackage.NAVIGATING_ARG_CS__INIT:
        return basicSetInit(null, msgs);
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
      case MyOclPackage.NAVIGATING_ARG_CS__NAME:
        return getName();
      case MyOclPackage.NAVIGATING_ARG_CS__OWNED_TYPE:
        return getOwnedType();
      case MyOclPackage.NAVIGATING_ARG_CS__INIT:
        return getInit();
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
      case MyOclPackage.NAVIGATING_ARG_CS__NAME:
        setName((NavigatingArgExpCS)newValue);
        return;
      case MyOclPackage.NAVIGATING_ARG_CS__OWNED_TYPE:
        setOwnedType((TypeExpCS)newValue);
        return;
      case MyOclPackage.NAVIGATING_ARG_CS__INIT:
        setInit((ExpCS)newValue);
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
      case MyOclPackage.NAVIGATING_ARG_CS__NAME:
        setName((NavigatingArgExpCS)null);
        return;
      case MyOclPackage.NAVIGATING_ARG_CS__OWNED_TYPE:
        setOwnedType((TypeExpCS)null);
        return;
      case MyOclPackage.NAVIGATING_ARG_CS__INIT:
        setInit((ExpCS)null);
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
      case MyOclPackage.NAVIGATING_ARG_CS__NAME:
        return name != null;
      case MyOclPackage.NAVIGATING_ARG_CS__OWNED_TYPE:
        return ownedType != null;
      case MyOclPackage.NAVIGATING_ARG_CS__INIT:
        return init != null;
    }
    return super.eIsSet(featureID);
  }

} //NavigatingArgCSImpl