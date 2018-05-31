/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactioncontainerPackage;
import biochemsimulation.reactioncontainer.SimBound;
import biochemsimulation.reactioncontainer.SimSite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sim Bound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SimBoundImpl#getSimSite2 <em>Sim Site2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimBoundImpl extends SimLinkStateImpl implements SimBound {
	/**
	 * The cached value of the '{@link #getSimSite2() <em>Sim Site2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimSite2()
	 * @generated
	 * @ordered
	 */
	protected SimSite simSite2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimBoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactioncontainerPackage.Literals.SIM_BOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSite getSimSite2() {
		if (simSite2 != null && simSite2.eIsProxy()) {
			InternalEObject oldSimSite2 = (InternalEObject) simSite2;
			simSite2 = (SimSite) eResolveProxy(oldSimSite2);
			if (simSite2 != oldSimSite2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ReactioncontainerPackage.SIM_BOUND__SIM_SITE2, oldSimSite2, simSite2));
			}
		}
		return simSite2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSite basicGetSimSite2() {
		return simSite2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimSite2(SimSite newSimSite2) {
		SimSite oldSimSite2 = simSite2;
		simSite2 = newSimSite2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactioncontainerPackage.SIM_BOUND__SIM_SITE2,
					oldSimSite2, simSite2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReactioncontainerPackage.SIM_BOUND__SIM_SITE2:
			if (resolve)
				return getSimSite2();
			return basicGetSimSite2();
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
		case ReactioncontainerPackage.SIM_BOUND__SIM_SITE2:
			setSimSite2((SimSite) newValue);
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
		case ReactioncontainerPackage.SIM_BOUND__SIM_SITE2:
			setSimSite2((SimSite) null);
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
		case ReactioncontainerPackage.SIM_BOUND__SIM_SITE2:
			return simSite2 != null;
		}
		return super.eIsSet(featureID);
	}

} //SimBoundImpl
