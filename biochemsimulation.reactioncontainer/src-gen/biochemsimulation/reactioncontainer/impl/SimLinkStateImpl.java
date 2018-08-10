/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;
import org.eclipse.emf.ecore.EClass;

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
public abstract class SimLinkStateImpl extends DefaultPersistentEObject implements SimLinkState {
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
		return ReactionContainerPackage.Literals.SIM_LINK_STATE;
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
	public SimSite getSimSite1() {
		return (SimSite) eGet(ReactionContainerPackage.Literals.SIM_LINK_STATE__SIM_SITE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimSite1(SimSite newSimSite1) {
		eSet(ReactionContainerPackage.Literals.SIM_LINK_STATE__SIM_SITE1, newSimSite1);
	}

} //SimLinkStateImpl
