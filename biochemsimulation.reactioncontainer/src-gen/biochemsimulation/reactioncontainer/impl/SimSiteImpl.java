/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactioncontainer.SimSiteState;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link biochemsimulation.reactioncontainer.impl.SimSiteImpl#getSimLinkState <em>Sim Link State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimSiteImpl extends DefaultPersistentEObject implements SimSite {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String) eGet(ReactionContainerPackage.Literals.SIM_SITE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(ReactionContainerPackage.Literals.SIM_SITE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSiteState getSimSiteState() {
		return (SimSiteState) eGet(ReactionContainerPackage.Literals.SIM_SITE__SIM_SITE_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimSiteState(SimSiteState newSimSiteState) {
		eSet(ReactionContainerPackage.Literals.SIM_SITE__SIM_SITE_STATE, newSimSiteState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimLinkState getSimLinkState() {
		return (SimLinkState) eGet(ReactionContainerPackage.Literals.SIM_SITE__SIM_LINK_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimLinkState(SimLinkState newSimLinkState) {
		eSet(ReactionContainerPackage.Literals.SIM_SITE__SIM_LINK_STATE, newSimLinkState);
	}

} //SimSiteImpl
