/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.LinkState;
import biochemsimulation.reactioncontainer.ReactioncontainerPackage;

import biochemsimulation.reactioncontainer.Site;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.LinkStateImpl#getSite1 <em>Site1</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinkStateImpl extends MinimalEObjectImpl.Container implements LinkState {
	/**
	 * The cached value of the '{@link #getSite1() <em>Site1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite1()
	 * @generated
	 * @ordered
	 */
	protected Site site1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactioncontainerPackage.Literals.LINK_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site getSite1() {
		if (site1 != null && site1.eIsProxy()) {
			InternalEObject oldSite1 = (InternalEObject) site1;
			site1 = (Site) eResolveProxy(oldSite1);
			if (site1 != oldSite1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ReactioncontainerPackage.LINK_STATE__SITE1, oldSite1, site1));
			}
		}
		return site1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site basicGetSite1() {
		return site1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite1(Site newSite1) {
		Site oldSite1 = site1;
		site1 = newSite1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactioncontainerPackage.LINK_STATE__SITE1, oldSite1,
					site1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReactioncontainerPackage.LINK_STATE__SITE1:
			if (resolve)
				return getSite1();
			return basicGetSite1();
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
		case ReactioncontainerPackage.LINK_STATE__SITE1:
			setSite1((Site) newValue);
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
		case ReactioncontainerPackage.LINK_STATE__SITE1:
			setSite1((Site) null);
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
		case ReactioncontainerPackage.LINK_STATE__SITE1:
			return site1 != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkStateImpl
