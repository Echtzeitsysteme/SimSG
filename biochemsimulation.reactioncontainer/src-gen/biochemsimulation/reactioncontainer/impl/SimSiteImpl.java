/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactioncontainer.SimSiteState;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sim Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SimSiteImpl#getType <em>Type</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SimSiteImpl#getSimSiteState <em>Sim Site State</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SimSiteImpl#getSimAgent <em>Sim Agent</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SimSiteImpl#getSimLinkState <em>Sim Link State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimSiteImpl extends MinimalEObjectImpl.Container implements SimSite {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSimSiteState() <em>Sim Site State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimSiteState()
	 * @generated
	 * @ordered
	 */
	protected SimSiteState simSiteState;

	/**
	 * The cached value of the '{@link #getSimAgent() <em>Sim Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimAgent()
	 * @generated
	 * @ordered
	 */
	protected SimAgent simAgent;

	/**
	 * The cached value of the '{@link #getSimLinkState() <em>Sim Link State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimLinkState()
	 * @generated
	 * @ordered
	 */
	protected SimLinkState simLinkState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactionContainerPackage.Literals.SIM_SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactionContainerPackage.SIM_SITE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSiteState getSimSiteState() {
		return simSiteState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimSiteState(SimSiteState newSimSiteState, NotificationChain msgs) {
		SimSiteState oldSimSiteState = simSiteState;
		simSiteState = newSimSiteState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ReactionContainerPackage.SIM_SITE__SIM_SITE_STATE, oldSimSiteState, newSimSiteState);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimSiteState(SimSiteState newSimSiteState) {
		if (newSimSiteState != simSiteState) {
			NotificationChain msgs = null;
			if (simSiteState != null)
				msgs = ((InternalEObject) simSiteState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ReactionContainerPackage.SIM_SITE__SIM_SITE_STATE, null, msgs);
			if (newSimSiteState != null)
				msgs = ((InternalEObject) newSimSiteState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ReactionContainerPackage.SIM_SITE__SIM_SITE_STATE, null, msgs);
			msgs = basicSetSimSiteState(newSimSiteState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactionContainerPackage.SIM_SITE__SIM_SITE_STATE,
					newSimSiteState, newSimSiteState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimAgent getSimAgent() {
		if (simAgent != null && simAgent.eIsProxy()) {
			InternalEObject oldSimAgent = (InternalEObject) simAgent;
			simAgent = (SimAgent) eResolveProxy(oldSimAgent);
			if (simAgent != oldSimAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ReactionContainerPackage.SIM_SITE__SIM_AGENT, oldSimAgent, simAgent));
			}
		}
		return simAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimAgent basicGetSimAgent() {
		return simAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimAgent(SimAgent newSimAgent) {
		SimAgent oldSimAgent = simAgent;
		simAgent = newSimAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactionContainerPackage.SIM_SITE__SIM_AGENT,
					oldSimAgent, simAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimLinkState getSimLinkState() {
		if (simLinkState != null && simLinkState.eIsProxy()) {
			InternalEObject oldSimLinkState = (InternalEObject) simLinkState;
			simLinkState = (SimLinkState) eResolveProxy(oldSimLinkState);
			if (simLinkState != oldSimLinkState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ReactionContainerPackage.SIM_SITE__SIM_LINK_STATE, oldSimLinkState, simLinkState));
			}
		}
		return simLinkState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimLinkState basicGetSimLinkState() {
		return simLinkState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimLinkState(SimLinkState newSimLinkState) {
		SimLinkState oldSimLinkState = simLinkState;
		simLinkState = newSimLinkState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactionContainerPackage.SIM_SITE__SIM_LINK_STATE,
					oldSimLinkState, simLinkState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReactionContainerPackage.SIM_SITE__SIM_SITE_STATE:
			return basicSetSimSiteState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReactionContainerPackage.SIM_SITE__TYPE:
			return getType();
		case ReactionContainerPackage.SIM_SITE__SIM_SITE_STATE:
			return getSimSiteState();
		case ReactionContainerPackage.SIM_SITE__SIM_AGENT:
			if (resolve)
				return getSimAgent();
			return basicGetSimAgent();
		case ReactionContainerPackage.SIM_SITE__SIM_LINK_STATE:
			if (resolve)
				return getSimLinkState();
			return basicGetSimLinkState();
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
		case ReactionContainerPackage.SIM_SITE__TYPE:
			setType((String) newValue);
			return;
		case ReactionContainerPackage.SIM_SITE__SIM_SITE_STATE:
			setSimSiteState((SimSiteState) newValue);
			return;
		case ReactionContainerPackage.SIM_SITE__SIM_AGENT:
			setSimAgent((SimAgent) newValue);
			return;
		case ReactionContainerPackage.SIM_SITE__SIM_LINK_STATE:
			setSimLinkState((SimLinkState) newValue);
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
		case ReactionContainerPackage.SIM_SITE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ReactionContainerPackage.SIM_SITE__SIM_SITE_STATE:
			setSimSiteState((SimSiteState) null);
			return;
		case ReactionContainerPackage.SIM_SITE__SIM_AGENT:
			setSimAgent((SimAgent) null);
			return;
		case ReactionContainerPackage.SIM_SITE__SIM_LINK_STATE:
			setSimLinkState((SimLinkState) null);
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
		case ReactionContainerPackage.SIM_SITE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ReactionContainerPackage.SIM_SITE__SIM_SITE_STATE:
			return simSiteState != null;
		case ReactionContainerPackage.SIM_SITE__SIM_AGENT:
			return simAgent != null;
		case ReactionContainerPackage.SIM_SITE__SIM_LINK_STATE:
			return simLinkState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SimSiteImpl
