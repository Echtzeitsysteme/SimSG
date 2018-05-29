/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.Agent;
import biochemsimulation.reactioncontainer.LinkState;
import biochemsimulation.reactioncontainer.ReactioncontainerPackage;
import biochemsimulation.reactioncontainer.Site;
import biochemsimulation.reactioncontainer.SiteState;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SiteImpl#getType <em>Type</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SiteImpl#getLinkstate <em>Linkstate</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SiteImpl#getSitestate <em>Sitestate</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SiteImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteImpl extends MinimalEObjectImpl.Container implements Site {
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
	 * The cached value of the '{@link #getLinkstate() <em>Linkstate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkstate()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkState> linkstate;

	/**
	 * The cached value of the '{@link #getSitestate() <em>Sitestate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitestate()
	 * @generated
	 * @ordered
	 */
	protected SiteState sitestate;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactioncontainerPackage.Literals.SITE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReactioncontainerPackage.SITE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkState> getLinkstate() {
		if (linkstate == null) {
			linkstate = new EObjectContainmentEList<LinkState>(LinkState.class, this,
					ReactioncontainerPackage.SITE__LINKSTATE);
		}
		return linkstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteState getSitestate() {
		if (sitestate != null && sitestate.eIsProxy()) {
			InternalEObject oldSitestate = (InternalEObject) sitestate;
			sitestate = (SiteState) eResolveProxy(oldSitestate);
			if (sitestate != oldSitestate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReactioncontainerPackage.SITE__SITESTATE,
							oldSitestate, sitestate));
			}
		}
		return sitestate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteState basicGetSitestate() {
		return sitestate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSitestate(SiteState newSitestate) {
		SiteState oldSitestate = sitestate;
		sitestate = newSitestate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactioncontainerPackage.SITE__SITESTATE,
					oldSitestate, sitestate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getAgent() {
		if (agent != null && agent.eIsProxy()) {
			InternalEObject oldAgent = (InternalEObject) agent;
			agent = (Agent) eResolveProxy(oldAgent);
			if (agent != oldAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReactioncontainerPackage.SITE__AGENT,
							oldAgent, agent));
			}
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(Agent newAgent) {
		Agent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactioncontainerPackage.SITE__AGENT, oldAgent,
					agent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReactioncontainerPackage.SITE__LINKSTATE:
			return ((InternalEList<?>) getLinkstate()).basicRemove(otherEnd, msgs);
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
		case ReactioncontainerPackage.SITE__TYPE:
			return getType();
		case ReactioncontainerPackage.SITE__LINKSTATE:
			return getLinkstate();
		case ReactioncontainerPackage.SITE__SITESTATE:
			if (resolve)
				return getSitestate();
			return basicGetSitestate();
		case ReactioncontainerPackage.SITE__AGENT:
			if (resolve)
				return getAgent();
			return basicGetAgent();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReactioncontainerPackage.SITE__TYPE:
			setType((String) newValue);
			return;
		case ReactioncontainerPackage.SITE__LINKSTATE:
			getLinkstate().clear();
			getLinkstate().addAll((Collection<? extends LinkState>) newValue);
			return;
		case ReactioncontainerPackage.SITE__SITESTATE:
			setSitestate((SiteState) newValue);
			return;
		case ReactioncontainerPackage.SITE__AGENT:
			setAgent((Agent) newValue);
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
		case ReactioncontainerPackage.SITE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ReactioncontainerPackage.SITE__LINKSTATE:
			getLinkstate().clear();
			return;
		case ReactioncontainerPackage.SITE__SITESTATE:
			setSitestate((SiteState) null);
			return;
		case ReactioncontainerPackage.SITE__AGENT:
			setAgent((Agent) null);
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
		case ReactioncontainerPackage.SITE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ReactioncontainerPackage.SITE__LINKSTATE:
			return linkstate != null && !linkstate.isEmpty();
		case ReactioncontainerPackage.SITE__SITESTATE:
			return sitestate != null;
		case ReactioncontainerPackage.SITE__AGENT:
			return agent != null;
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

} //SiteImpl
