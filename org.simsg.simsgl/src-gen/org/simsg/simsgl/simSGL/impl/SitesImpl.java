/**
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl.simSGL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.simsg.simsgl.simSGL.SimSGLPackage;
import org.simsg.simsgl.simSGL.Site;
import org.simsg.simsgl.simSGL.Sites;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sites</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.simsg.simsgl.simSGL.impl.SitesImpl#getSites <em>Sites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SitesImpl extends MinimalEObjectImpl.Container implements Sites
{
  /**
   * The cached value of the '{@link #getSites() <em>Sites</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSites()
   * @generated
   * @ordered
   */
  protected EList<Site> sites;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SitesImpl()
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
    return SimSGLPackage.Literals.SITES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Site> getSites()
  {
    if (sites == null)
    {
      sites = new EObjectContainmentEList<Site>(Site.class, this, SimSGLPackage.SITES__SITES);
    }
    return sites;
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
      case SimSGLPackage.SITES__SITES:
        return ((InternalEList<?>)getSites()).basicRemove(otherEnd, msgs);
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
      case SimSGLPackage.SITES__SITES:
        return getSites();
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
      case SimSGLPackage.SITES__SITES:
        getSites().clear();
        getSites().addAll((Collection<? extends Site>)newValue);
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
      case SimSGLPackage.SITES__SITES:
        getSites().clear();
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
      case SimSGLPackage.SITES__SITES:
        return sites != null && !sites.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SitesImpl