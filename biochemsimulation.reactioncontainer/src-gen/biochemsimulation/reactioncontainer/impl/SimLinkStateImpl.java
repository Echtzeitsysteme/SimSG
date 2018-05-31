/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactioncontainerPackage;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sim Link State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SimLinkStateImpl#getSimSite1 <em>Sim Site1</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimLinkStateImpl extends MinimalEObjectImpl.Container implements SimLinkState {
	/**
	 * The cached value of the '{@link #getSimSite1() <em>Sim Site1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimSite1()
	 * @generated
	 * @ordered
	 */
	protected SimSite simSite1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimLinkStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactioncontainerPackage.Literals.SIM_LINK_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSite getSimSite1() {
		if (simSite1 != null && simSite1.eIsProxy()) {
			InternalEObject oldSimSite1 = (InternalEObject) simSite1;
			simSite1 = (SimSite) eResolveProxy(oldSimSite1);
			if (simSite1 != oldSimSite1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ReactioncontainerPackage.SIM_LINK_STATE__SIM_SITE1, oldSimSite1, simSite1));
			}
		}
		return simSite1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSite basicGetSimSite1() {
		return simSite1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimSite1(SimSite newSimSite1) {
		SimSite oldSimSite1 = simSite1;
		simSite1 = newSimSite1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactioncontainerPackage.SIM_LINK_STATE__SIM_SITE1,
					oldSimSite1, simSite1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReactioncontainerPackage.SIM_LINK_STATE__SIM_SITE1:
			if (resolve)
				return getSimSite1();
			return basicGetSimSite1();
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
		case ReactioncontainerPackage.SIM_LINK_STATE__SIM_SITE1:
			setSimSite1((SimSite) newValue);
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
		case ReactioncontainerPackage.SIM_LINK_STATE__SIM_SITE1:
			setSimSite1((SimSite) null);
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
		case ReactioncontainerPackage.SIM_LINK_STATE__SIM_SITE1:
			return simSite1 != null;
		}
		return super.eIsSet(featureID);
	}

} //SimLinkStateImpl
