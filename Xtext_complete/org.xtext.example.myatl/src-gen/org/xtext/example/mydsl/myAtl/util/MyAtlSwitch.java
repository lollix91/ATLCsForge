/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myAtl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myAtl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myAtl.MyAtlPackage
 * @generated
 */
public class MyAtlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyAtlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyAtlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyAtlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyAtlPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.MODULE_ELEMENT:
      {
        ModuleElement moduleElement = (ModuleElement)theEObject;
        T result = caseModuleElement(moduleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.MATCHED_RULE:
      {
        MatchedRule matchedRule = (MatchedRule)theEObject;
        T result = caseMatchedRule(matchedRule);
        if (result == null) result = caseModuleElement(matchedRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.CALLED_RULE:
      {
        CalledRule calledRule = (CalledRule)theEObject;
        T result = caseCalledRule(calledRule);
        if (result == null) result = caseModuleElement(calledRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.HELPER:
      {
        Helper helper = (Helper)theEObject;
        T result = caseHelper(helper);
        if (result == null) result = caseModuleElement(helper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.ATL_DEF_CS:
      {
        ATLDefCS atlDefCS = (ATLDefCS)theEObject;
        T result = caseATLDefCS(atlDefCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.ATL_PARAMETER_CS:
      {
        ATLParameterCS atlParameterCS = (ATLParameterCS)theEObject;
        T result = caseATLParameterCS(atlParameterCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.RULE_VARIABLE_DECLARATION:
      {
        RuleVariableDeclaration ruleVariableDeclaration = (RuleVariableDeclaration)theEObject;
        T result = caseRuleVariableDeclaration(ruleVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.IN_PATTERN:
      {
        InPattern inPattern = (InPattern)theEObject;
        T result = caseInPattern(inPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.IN_PATTERN_ELEMENT:
      {
        InPatternElement inPatternElement = (InPatternElement)theEObject;
        T result = caseInPatternElement(inPatternElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.OUT_PATTERN:
      {
        OutPattern outPattern = (OutPattern)theEObject;
        T result = caseOutPattern(outPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.OUT_PATTERN_ELEMENT:
      {
        OutPatternElement outPatternElement = (OutPatternElement)theEObject;
        T result = caseOutPatternElement(outPatternElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.SIMPLE_OUT_PATTERN_ELEMENT:
      {
        SimpleOutPatternElement simpleOutPatternElement = (SimpleOutPatternElement)theEObject;
        T result = caseSimpleOutPatternElement(simpleOutPatternElement);
        if (result == null) result = caseOutPatternElement(simpleOutPatternElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.FOR_EACH_OUT_PATTERN_ELEMENT:
      {
        ForEachOutPatternElement forEachOutPatternElement = (ForEachOutPatternElement)theEObject;
        T result = caseForEachOutPatternElement(forEachOutPatternElement);
        if (result == null) result = caseOutPatternElement(forEachOutPatternElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.BINDING:
      {
        Binding binding = (Binding)theEObject;
        T result = caseBinding(binding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.ACTION_BLOCK:
      {
        ActionBlock actionBlock = (ActionBlock)theEObject;
        T result = caseActionBlock(actionBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.BINDING_STAT:
      {
        BindingStat bindingStat = (BindingStat)theEObject;
        T result = caseBindingStat(bindingStat);
        if (result == null) result = caseStatement(bindingStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyAtlPackage.ATL_TYPE:
      {
        ATLType atlType = (ATLType)theEObject;
        T result = caseATLType(atlType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleElement(ModuleElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matched Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matched Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchedRule(MatchedRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Called Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Called Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCalledRule(CalledRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Helper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Helper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelper(Helper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ATL Def CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ATL Def CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseATLDefCS(ATLDefCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ATL Parameter CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ATL Parameter CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseATLParameterCS(ATLParameterCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleVariableDeclaration(RuleVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInPattern(InPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Pattern Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Pattern Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInPatternElement(InPatternElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutPattern(OutPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Pattern Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Pattern Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutPatternElement(OutPatternElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Out Pattern Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Out Pattern Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleOutPatternElement(SimpleOutPatternElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Each Out Pattern Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Each Out Pattern Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForEachOutPatternElement(ForEachOutPatternElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding(Binding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionBlock(ActionBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindingStat(BindingStat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ATL Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ATL Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseATLType(ATLType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyAtlSwitch