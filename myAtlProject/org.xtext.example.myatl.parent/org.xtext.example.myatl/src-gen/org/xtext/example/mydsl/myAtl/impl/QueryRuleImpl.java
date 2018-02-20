/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myAtl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myAtl.ATLParameterCS;
import org.xtext.example.mydsl.myAtl.ExpCS;
import org.xtext.example.mydsl.myAtl.MyAtlPackage;
import org.xtext.example.mydsl.myAtl.QueryRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myAtl.impl.QueryRuleImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myAtl.impl.QueryRuleImpl#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryRuleImpl extends ModuleElementImpl implements QueryRule
{
  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ATLParameterCS> parameters;

  /**
   * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitExpression()
   * @generated
   * @ordered
   */
  protected ExpCS initExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryRuleImpl()
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
    return MyAtlPackage.Literals.QUERY_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ATLParameterCS> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ATLParameterCS>(ATLParameterCS.class, this, MyAtlPackage.QUERY_RULE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getInitExpression()
  {
    return initExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitExpression(ExpCS newInitExpression, NotificationChain msgs)
  {
    ExpCS oldInitExpression = initExpression;
    initExpression = newInitExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyAtlPackage.QUERY_RULE__INIT_EXPRESSION, oldInitExpression, newInitExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitExpression(ExpCS newInitExpression)
  {
    if (newInitExpression != initExpression)
    {
      NotificationChain msgs = null;
      if (initExpression != null)
        msgs = ((InternalEObject)initExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyAtlPackage.QUERY_RULE__INIT_EXPRESSION, null, msgs);
      if (newInitExpression != null)
        msgs = ((InternalEObject)newInitExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyAtlPackage.QUERY_RULE__INIT_EXPRESSION, null, msgs);
      msgs = basicSetInitExpression(newInitExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyAtlPackage.QUERY_RULE__INIT_EXPRESSION, newInitExpression, newInitExpression));
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
      case MyAtlPackage.QUERY_RULE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case MyAtlPackage.QUERY_RULE__INIT_EXPRESSION:
        return basicSetInitExpression(null, msgs);
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
      case MyAtlPackage.QUERY_RULE__PARAMETERS:
        return getParameters();
      case MyAtlPackage.QUERY_RULE__INIT_EXPRESSION:
        return getInitExpression();
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
      case MyAtlPackage.QUERY_RULE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ATLParameterCS>)newValue);
        return;
      case MyAtlPackage.QUERY_RULE__INIT_EXPRESSION:
        setInitExpression((ExpCS)newValue);
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
      case MyAtlPackage.QUERY_RULE__PARAMETERS:
        getParameters().clear();
        return;
      case MyAtlPackage.QUERY_RULE__INIT_EXPRESSION:
        setInitExpression((ExpCS)null);
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
      case MyAtlPackage.QUERY_RULE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MyAtlPackage.QUERY_RULE__INIT_EXPRESSION:
        return initExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryRuleImpl