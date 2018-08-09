/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.SimBound;
import biochemsimulation.reactioncontainer.SimSite;
import org.eclipse.emf.ecore.EClass;

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
		return ReactionContainerPackage.Literals.SIM_BOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSite getSimSite2() {
		return (SimSite) eGet(ReactionContainerPackage.Literals.SIM_BOUND__SIM_SITE2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimSite2(SimSite newSimSite2) {
		eSet(ReactionContainerPackage.Literals.SIM_BOUND__SIM_SITE2, newSimSite2);
	}

} //SimBoundImpl
