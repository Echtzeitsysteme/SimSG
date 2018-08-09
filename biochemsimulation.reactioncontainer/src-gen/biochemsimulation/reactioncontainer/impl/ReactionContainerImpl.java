/**
 */
package biochemsimulation.reactioncontainer.impl;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerPackage;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimLinkState;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.ReactionContainerImpl#getSimAgent <em>Sim Agent</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.ReactionContainerImpl#getSimLinkStates <em>Sim Link States</em>}</li>
 *   <li>{@link biochemsimulation.reactioncontainer.impl.ReactionContainerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactionContainerImpl extends DefaultPersistentEObject implements ReactionContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactionContainerPackage.Literals.REACTION_CONTAINER;
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
	@SuppressWarnings("unchecked")
	public EList<SimAgent> getSimAgent() {
		return (EList<SimAgent>) eGet(ReactionContainerPackage.Literals.REACTION_CONTAINER__SIM_AGENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimLinkState> getSimLinkStates() {
		return (EList<SimLinkState>) eGet(ReactionContainerPackage.Literals.REACTION_CONTAINER__SIM_LINK_STATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(ReactionContainerPackage.Literals.REACTION_CONTAINER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ReactionContainerPackage.Literals.REACTION_CONTAINER__NAME, newName);
	}

} //ReactionContainerImpl
