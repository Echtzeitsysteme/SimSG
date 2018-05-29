/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.Bound;
import biochemsimulation.reactioncontainer.ReactioncontainerPackage;
import biochemsimulation.reactioncontainer.Site;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.BoundImpl#getSite2 <em>Site2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundImpl extends LinkStateImpl implements Bound {
	/**
	 * The cached value of the '{@link #getSite2() <em>Site2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite2()
	 * @generated
	 * @ordered
	 */
	protected Site site2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactioncontainerPackage.Literals.BOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site getSite2() {
		if (site2 != null && site2.eIsProxy()) {
			InternalEObject oldSite2 = (InternalEObject) site2;
			site2 = (Site) eResolveProxy(oldSite2);
			if (site2 != oldSite2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReactioncontainerPackage.BOUND__SITE2,
							oldSite2, site2));
			}
		}
		return site2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site basicGetSite2() {
		return site2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite2(Site newSite2) {
		Site oldSite2 = site2;
		site2 = newSite2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactioncontainerPackage.BOUND__SITE2, oldSite2,
					site2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReactioncontainerPackage.BOUND__SITE2:
			if (resolve)
				return getSite2();
			return basicGetSite2();
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
		case ReactioncontainerPackage.BOUND__SITE2:
			setSite2((Site) newValue);
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
		case ReactioncontainerPackage.BOUND__SITE2:
			setSite2((Site) null);
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
		case ReactioncontainerPackage.BOUND__SITE2:
			return site2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BoundImpl
