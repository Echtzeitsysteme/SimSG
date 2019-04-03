/**
 */
package Goldbeter_Koshland.impl;

import Goldbeter_Koshland.Goldbeter_KoshlandPackage;
import Goldbeter_Koshland.P;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.simsg.container.Agent;

import org.simsg.container.impl.AgentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Goldbeter_Koshland.impl.PImpl#getP_a <em>Pa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PImpl extends AgentImpl implements P {
	/**
	 * The cached value of the '{@link #getP_a() <em>Pa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_a()
	 * @generated
	 * @ordered
	 */
	protected Agent p_a;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Goldbeter_KoshlandPackage.Literals.P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getP_a() {
		if (p_a != null && p_a.eIsProxy()) {
			InternalEObject oldP_a = (InternalEObject)p_a;
			p_a = (Agent)eResolveProxy(oldP_a);
			if (p_a != oldP_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Goldbeter_KoshlandPackage.P__PA, oldP_a, p_a));
			}
		}
		return p_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetP_a() {
		return p_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP_a(Agent newP_a) {
		Agent oldP_a = p_a;
		p_a = newP_a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Goldbeter_KoshlandPackage.P__PA, oldP_a, p_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Goldbeter_KoshlandPackage.P__PA:
				if (resolve) return getP_a();
				return basicGetP_a();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Goldbeter_KoshlandPackage.P__PA:
				setP_a((Agent)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Goldbeter_KoshlandPackage.P__PA:
				setP_a((Agent)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Goldbeter_KoshlandPackage.P__PA:
				return p_a != null;
		}
		return super.eIsSet(featureID);
	}

} //PImpl
