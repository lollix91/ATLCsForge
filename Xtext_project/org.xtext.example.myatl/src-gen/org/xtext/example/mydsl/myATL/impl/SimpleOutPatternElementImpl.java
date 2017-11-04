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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myATL.ATLType;
import org.xtext.example.mydsl.myATL.Binding;
import org.xtext.example.mydsl.myATL.MyATLPackage;
import org.xtext.example.mydsl.myATL.SimpleOutPatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Out Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myATL.impl.SimpleOutPatternElementImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.impl.SimpleOutPatternElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myATL.impl.SimpleOutPatternElementImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleOutPatternElementImpl extends OutPatternElementImpl implements SimpleOutPatternElement
{
  /**
   * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected static final String VAR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected String varName = VAR_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ATLType type;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleOutPatternElementImpl()
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
    return MyATLPackage.Literals.SIMPLE_OUT_PATTERN_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarName()
  {
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarName(String newVarName)
  {
    String oldVarName = varName;
    varName = newVarName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ATLType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(ATLType newType, NotificationChain msgs)
  {
    ATLType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ATLType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Binding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<Binding>(Binding.class, this, MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__BINDINGS);
    }
    return bindings;
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
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__TYPE:
        return basicSetType(null, msgs);
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__BINDINGS:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__VAR_NAME:
        return getVarName();
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__TYPE:
        return getType();
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__BINDINGS:
        return getBindings();
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
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__VAR_NAME:
        setVarName((String)newValue);
        return;
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__TYPE:
        setType((ATLType)newValue);
        return;
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends Binding>)newValue);
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
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__VAR_NAME:
        setVarName(VAR_NAME_EDEFAULT);
        return;
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__TYPE:
        setType((ATLType)null);
        return;
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__BINDINGS:
        getBindings().clear();
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
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__VAR_NAME:
        return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__TYPE:
        return type != null;
      case MyATLPackage.SIMPLE_OUT_PATTERN_ELEMENT__BINDINGS:
        return bindings != null && !bindings.isEmpty();
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
    result.append(" (varName: ");
    result.append(varName);
    result.append(')');
    return result.toString();
  }

} //SimpleOutPatternElementImpl
