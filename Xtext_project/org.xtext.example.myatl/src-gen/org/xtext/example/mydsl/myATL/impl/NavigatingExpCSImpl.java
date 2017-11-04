/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myATL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myATL.MyATLPackage;
import org.xtext.example.mydsl.myATL.NavigatingExpCS;
import org.xtext.example.mydsl.myATL.NavigatingExpCS_Base;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigating Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myATL.impl.NavigatingExpCSImpl#getNamedExp <em>Named Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.impl.NavigatingExpCSImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigatingExpCSImpl extends PrimaryExpCSImpl implements NavigatingExpCS
{
  /**
   * The cached value of the '{@link #getNamedExp() <em>Named Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedExp()
   * @generated
   * @ordered
   */
  protected NavigatingExpCS_Base namedExp;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected EList<EObject> argument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NavigatingExpCSImpl()
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
    return MyATLPackage.Literals.NAVIGATING_EXP_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigatingExpCS_Base getNamedExp()
  {
    return namedExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamedExp(NavigatingExpCS_Base newNamedExp, NotificationChain msgs)
  {
    NavigatingExpCS_Base oldNamedExp = namedExp;
    namedExp = newNamedExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyATLPackage.NAVIGATING_EXP_CS__NAMED_EXP, oldNamedExp, newNamedExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamedExp(NavigatingExpCS_Base newNamedExp)
  {
    if (newNamedExp != namedExp)
    {
      NotificationChain msgs = null;
      if (namedExp != null)
        msgs = ((InternalEObject)namedExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyATLPackage.NAVIGATING_EXP_CS__NAMED_EXP, null, msgs);
      if (newNamedExp != null)
        msgs = ((InternalEObject)newNamedExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyATLPackage.NAVIGATING_EXP_CS__NAMED_EXP, null, msgs);
      msgs = basicSetNamedExp(newNamedExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyATLPackage.NAVIGATING_EXP_CS__NAMED_EXP, newNamedExp, newNamedExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getArgument()
  {
    if (argument == null)
    {
      argument = new EObjectContainmentEList<EObject>(EObject.class, this, MyATLPackage.NAVIGATING_EXP_CS__ARGUMENT);
    }
    return argument;
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
      case MyATLPackage.NAVIGATING_EXP_CS__NAMED_EXP:
        return basicSetNamedExp(null, msgs);
      case MyATLPackage.NAVIGATING_EXP_CS__ARGUMENT:
        return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
      case MyATLPackage.NAVIGATING_EXP_CS__NAMED_EXP:
        return getNamedExp();
      case MyATLPackage.NAVIGATING_EXP_CS__ARGUMENT:
        return getArgument();
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
      case MyATLPackage.NAVIGATING_EXP_CS__NAMED_EXP:
        setNamedExp((NavigatingExpCS_Base)newValue);
        return;
      case MyATLPackage.NAVIGATING_EXP_CS__ARGUMENT:
        getArgument().clear();
        getArgument().addAll((Collection<? extends EObject>)newValue);
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
      case MyATLPackage.NAVIGATING_EXP_CS__NAMED_EXP:
        setNamedExp((NavigatingExpCS_Base)null);
        return;
      case MyATLPackage.NAVIGATING_EXP_CS__ARGUMENT:
        getArgument().clear();
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
      case MyATLPackage.NAVIGATING_EXP_CS__NAMED_EXP:
        return namedExp != null;
      case MyATLPackage.NAVIGATING_EXP_CS__ARGUMENT:
        return argument != null && !argument.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NavigatingExpCSImpl
