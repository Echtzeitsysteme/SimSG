/**
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.simSGL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.simsg.simsgl.simSGL.ArithmeticVariable;
import org.simsg.simsgl.simSGL.NumericFromVariable;
import org.simsg.simsgl.simSGL.SimSGLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric From Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.simsg.simsgl.simSGL.impl.NumericFromVariableImpl#getValueVar <em>Value Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericFromVariableImpl extends NumericAssignmentImpl implements NumericFromVariable
{
  /**
   * The cached value of the '{@link #getValueVar() <em>Value Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueVar()
   * @generated
   * @ordered
   */
  protected ArithmeticVariable valueVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumericFromVariableImpl()
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
    return SimSGLPackage.Literals.NUMERIC_FROM_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticVariable getValueVar()
  {
    if (valueVar != null && valueVar.eIsProxy())
    {
      InternalEObject oldValueVar = (InternalEObject)valueVar;
      valueVar = (ArithmeticVariable)eResolveProxy(oldValueVar);
      if (valueVar != oldValueVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimSGLPackage.NUMERIC_FROM_VARIABLE__VALUE_VAR, oldValueVar, valueVar));
      }
    }
    return valueVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticVariable basicGetValueVar()
  {
    return valueVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueVar(ArithmeticVariable newValueVar)
  {
    ArithmeticVariable oldValueVar = valueVar;
    valueVar = newValueVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimSGLPackage.NUMERIC_FROM_VARIABLE__VALUE_VAR, oldValueVar, valueVar));
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
      case SimSGLPackage.NUMERIC_FROM_VARIABLE__VALUE_VAR:
        if (resolve) return getValueVar();
        return basicGetValueVar();
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
      case SimSGLPackage.NUMERIC_FROM_VARIABLE__VALUE_VAR:
        setValueVar((ArithmeticVariable)newValue);
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
      case SimSGLPackage.NUMERIC_FROM_VARIABLE__VALUE_VAR:
        setValueVar((ArithmeticVariable)null);
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
      case SimSGLPackage.NUMERIC_FROM_VARIABLE__VALUE_VAR:
        return valueVar != null;
    }
    return super.eIsSet(featureID);
  }

} //NumericFromVariableImpl